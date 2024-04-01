package com.example.demo.dto;


import com.example.demo.model.ArtifitialRepresentative;
import com.example.demo.model.NaturalRepresentative;

public class ArtifitialRepresentativeRequestDTO extends ArtifitialRepresentative{
	
	private NaturalRepresentative naturalRepresentative;
	
	public ArtifitialRepresentativeRequestDTO(){}

	public NaturalRepresentative getNaturalRepresentative() {
		return naturalRepresentative;
	}

	public void setNaturalRepresentative(NaturalRepresentative naturalRepresentative) {
		this.naturalRepresentative = naturalRepresentative;
	}
}
