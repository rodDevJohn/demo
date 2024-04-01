package com.example.demo.model;

public class ArtifitialApplicant extends Applicant{

	
	private String socialReason;
	private String companyConstitutionDate; //ojo datetime
	private String companyActivity;
	private String companyCNAE;
	//class lista representatives

	
	public ArtifitialApplicant(){}
	
	public ArtifitialApplicant(String applicantType, String idType,
			String idCountry, String idNumber, Address address,
			Address address2, String telephone1, String telephone2,
			String telephone3, String email, BankDetails bankDetails,
			ExtraInfoApplicant extraInfoApplicant) {
		super(applicantType, idType, idCountry, idNumber, address, address2,
				telephone1, telephone2, telephone3, email, bankDetails,
				extraInfoApplicant);
	
	}


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
