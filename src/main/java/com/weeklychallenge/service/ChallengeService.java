package com.weeklychallenge.service;

import com.weeklychallenge.application.model.ChallengeEntity;
import com.weeklychallenge.repository.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeService {

    @Autowired
    private ChallengeRepository repository;

    public List<ChallengeEntity> getAllProducts() {
        return repository.findAll();
    }

    public ChallengeEntity createProduct(ChallengeEntity request) {
        return repository.save(request);
    }
}
