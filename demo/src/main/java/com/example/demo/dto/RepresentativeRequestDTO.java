package com.example.demo.dto;


import com.example.demo.model.NaturalRepresentative;
import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepresentativeRequestDTO{
	
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private NaturalRepresentative naturalRepresentative;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private ArtifitialRepresentativeRequestDTO artifitialRepresentative;
	

	public RepresentativeRequestDTO(){}

	
	public NaturalRepresentative getNaturalRepresentative() {
		return naturalRepresentative;
	}

	public void setNaturalRepresentative(NaturalRepresentative naturalRepresentative) {
		this.naturalRepresentative = naturalRepresentative;
	}

	public ArtifitialRepresentativeRequestDTO getArtifitialRepresentative() {
		return artifitialRepresentative;
	}

	public void setArtifitialRepresentative(ArtifitialRepresentativeRequestDTO artifitialRepresentative) {
		this.artifitialRepresentative = artifitialRepresentative;
	}
	
	
	
}
