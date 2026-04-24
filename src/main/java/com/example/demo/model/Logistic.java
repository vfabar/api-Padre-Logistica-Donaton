package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Logistic")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Logistic {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLogistic;

    @ManyToOne
    @JoinColumn(name = "idDonation", nullable = false)
    private Donation idDonation;

    @ManyToOne
    @JoinColumn(name = "idNeeds", nullable = false)
    private Needs idNeeds;
}
