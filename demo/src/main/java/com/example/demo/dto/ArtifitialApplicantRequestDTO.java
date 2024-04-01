package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.ArtifitialApplicant;
import com.fasterxml.jackson.annotation.JsonInclude;


public class ArtifitialApplicantRequestDTO extends ArtifitialApplicant{
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<RepresentativeRequestDTO> representatives;

	
	public ArtifitialApplicantRequestDTO() {
		
	}


	public List<RepresentativeRequestDTO> getRepresentatives() {
		return representatives;
	}


	public void setRepresentatives(List<RepresentativeRequestDTO> representatives) {
		this.representatives = representatives;
	}

}
