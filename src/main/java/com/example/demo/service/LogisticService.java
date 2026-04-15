package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Logistic;
import com.example.demo.repository.LogisticRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LogisticService {
    
    @Autowired
    private LogisticRepository logisticRepository;

    public List<Logistic> findAll() {
        return logisticRepository.findAll();
    }

    public Logistic findById(Long id) {
        return logisticRepository.findById(id).orElse(null);
    }

    public Logistic save(Logistic logistic) {
        return logisticRepository.save(logistic);
    }
    public void deleteById(Long id) {
        logisticRepository.deleteById(id);
    }


}
