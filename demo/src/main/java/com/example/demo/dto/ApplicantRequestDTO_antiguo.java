package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.NaturalApplicant;


public class ApplicantRequestDTO_antiguo{
	
	
	private List<NaturalApplicant> naturalApplicant;
	//private List<ArtifitialApplicant> artifitialApplicant;
	private List<ArtifitialApplicantRequestDTO> artifitialApplicant;
	
	public ApplicantRequestDTO_antiguo(){}
	
	public List<NaturalApplicant> getNaturalApplicant() {
		return naturalApplicant;
	}

	public void setNaturalApplicant(List<NaturalApplicant> naturalApplicant) {
		this.naturalApplicant = naturalApplicant;
	}

//	public List<ArtifitialApplicant> getArtifitialApplicant() {
//		return artifitialApplicant;
//	}
//
//	public void setArtifitialApplicant(List<ArtifitialApplicant> artifitialApplicant) {
//		this.artifitialApplicant = artifitialApplicant;
//	}
	
	public List<ArtifitialApplicantRequestDTO> getArtifitialApplicant() {
		return artifitialApplicant;
	}

	public void setArtifitialApplicant(List<ArtifitialApplicantRequestDTO> artifitialApplicant) {
		this.artifitialApplicant = artifitialApplicant;
	}
	
}
