package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Logistic;
import com.example.demo.service.LogisticService;


@RestController
@RequestMapping("/api/v1/logistic")
public class LogisticController {
    @Autowired
    private LogisticService logisticService;

    @GetMapping
    public ResponseEntity<List<Logistic>> getAllLogistics() {
        List<Logistic> logistics = logisticService.findAll();
        if (logistics.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(logistics);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Logistic> getLogisticById(@PathVariable Long id) {
        Logistic logistic = logisticService.findById(id);
        if (logistic == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(logistic);
    }

    @PostMapping
    public ResponseEntity<Logistic> createLogistic(@RequestBody Logistic logistic) {
        Logistic savedLogistic = logisticService.save(logistic);
        return ResponseEntity.status(201).body(savedLogistic);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLogistic(@PathVariable Long id) {
        logisticService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
