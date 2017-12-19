package com.tek.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.transaction.annotation.Transactional;

import com.tek.model.CandidateDetails;


@Transactional
public interface CandidateRepositiory extends MongoRepository<CandidateDetails, String> {
}