package com.tek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tek.Dao.CandidateRepositiory;
import com.tek.model.CandidateDetails;

@Service
public class CandidateService {
	@Autowired
	CandidateRepositiory candidateRepositiory;
	
	public List<CandidateDetails> findalldetails(){
		return candidateRepositiory.findAll();
		
	}
	public void save(CandidateDetails candidateDetails){
	candidateRepositiory.save(candidateDetails);
	}
}
