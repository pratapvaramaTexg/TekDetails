package com.tek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tek.model.CandidateDetails;
import com.tek.service.CandidateService;
@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/")
public class CandidateController {

	@Autowired
	CandidateService candidateService;

	@RequestMapping(value = "candidate", method = RequestMethod.GET)
	public ResponseEntity<List<CandidateDetails>> listallCandidate() {
		System.out.println("listAllCandidate()");
		List<CandidateDetails> candidates = candidateService.findalldetails();
		System.out.println("get method");
		return new ResponseEntity<List<CandidateDetails>>(candidates, HttpStatus.OK);
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	public ResponseEntity<Void> createdetails(@RequestBody CandidateDetails candidateDetails){
		 candidateService.save(candidateDetails);
		 System.out.println("post method");
	        return new ResponseEntity<Void>(HttpStatus.CREATED);
	    }
}
