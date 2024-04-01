package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArtifitialRepresentative extends Representative{

	private String socialReason;
	private String companyConstitutionDate; //ojo datetime
	private String companyActivity;
	private String companyCNAE;
	
	public ArtifitialRepresentative(){}

	public String getSocialReason() {
		return socialReason;
	}

	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}

	public String getCompanyConstitutionDate() {
		return companyConstitutionDate;
	}

	public void setCompanyConstitutionDate(String companyConstitutionDate) {
		this.companyConstitutionDate = companyConstitutionDate;
	}

	public String getCompanyActivity() {
		return companyActivity;
	}

	public void setCompanyActivity(String companyActivity) {
		this.companyActivity = companyActivity;
	}

	public String getCompanyCNAE() {
		return companyCNAE;
	}

	public void setCompanyCNAE(String companyCNAE) {
		this.companyCNAE = companyCNAE;
	}
	
}
