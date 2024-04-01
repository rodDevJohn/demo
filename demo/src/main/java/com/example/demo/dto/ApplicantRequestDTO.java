package com.example.demo.dto;

import com.example.demo.model.NaturalApplicant;

public class ApplicantRequestDTO {
	
	private NaturalApplicant naturalApplicant;
	private ArtifitialApplicantRequestDTO artifitialApplicant;
	
	
	public ApplicantRequestDTO(){}

	
	public NaturalApplicant getNaturalApplicant() {
		return naturalApplicant;
	}

	public void setNaturalApplicant(NaturalApplicant naturalApplicant) {
		this.naturalApplicant = naturalApplicant;
	}

	public ArtifitialApplicantRequestDTO getArtifitialApplicant() {
		return artifitialApplicant;
	}

	public void setArtifitialApplicant(ArtifitialApplicantRequestDTO artifitialApplicant) {
		this.artifitialApplicant = artifitialApplicant;
	}
	
	
}
