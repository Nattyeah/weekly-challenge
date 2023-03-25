package com.weeklychallenge.repository;

import com.weeklychallenge.application.model.ChallengeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepository extends MongoRepository<ChallengeEntity, String> {
}
