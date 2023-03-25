package com.weeklychallenge.application.controller;

import com.weeklychallenge.application.model.ChallengeEntity;
import com.weeklychallenge.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("challenge/V1")
public class ChallengeController {

    @Autowired
    private ChallengeService service;

    @GetMapping("/products")
    public ResponseEntity<List<ChallengeEntity>> getAllProducts() {
        return ResponseEntity.ok(service.getAllProducts());
    }

    @PostMapping("/product")
    public ResponseEntity<ChallengeEntity> createNewProduct(@RequestBody ChallengeEntity request) {
        return new ResponseEntity<>(service.createProduct(request), HttpStatus.CREATED);
    }
}
