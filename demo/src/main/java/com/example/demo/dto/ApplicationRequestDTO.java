package com.example.demo.dto;



import java.util.List;

import com.example.demo.model.Application;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationRequestDTO extends Application {

	//private ApplicantRequestDTO applicants;
	private List<ApplicantRequestDTO> applicants;
	
	public ApplicationRequestDTO(){}
	
	
	public List<ApplicantRequestDTO> getApplicants() {
		return applicants;
	}

	public void setApplicants(List<ApplicantRequestDTO> applicants) {
		this.applicants = applicants;
	}

	
	
}
