package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Logistic;

@Repository
public interface LogisticRepository extends JpaRepository<Logistic, Long> {
    
}
