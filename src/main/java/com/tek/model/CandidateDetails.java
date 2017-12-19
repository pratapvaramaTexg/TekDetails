package com.tek.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="details")
public class CandidateDetails {
	@Id
	private String id;
	
	private String firstName;
	private String lastName;
	private String SkypeId;

	public CandidateDetails() {

	}

	public CandidateDetails(String id, String firstName, String lastName, String SkypeId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.SkypeId = SkypeId;
	}

	public String getid() {
		return id;
	}

	public void setrollnumber(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSkypeId() {
		return SkypeId;
	}

	public void setSkypeId(String skypeId) {
		SkypeId = skypeId;
	}

	@Override
	public String toString() {
		return "CandidateDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", SkypeId="
				+ SkypeId + "]";
	}

}
