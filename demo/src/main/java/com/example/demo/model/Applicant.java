package com.example.demo.model;

import java.util.List;





public class Applicant {
	private String applicantType; // puede ir hacia bbdd(indicador tipo persona principal)   
	private String idType;
	private String idCountry; //puede ir hacia bbdd(ÌP???)
	private String idNumber;
	private Address address;
	private Address address2; //Máximo dos direcciones
	private String telephone1;
	private String telephone2;
	private String telephone3;
	private String email;
	private BankDetails bankDetails;
	private ExtraInfoApplicant extraInfoApplicant;
	
//	private List<NaturalApplicant> naturalApplicant;
	
	public Applicant(){
	};
	
	public Applicant(String applicantType, String idType, String idCountry,
			String idNumber, Address address, Address address2,
			String telephone1, String telephone2, String telephone3,
			String email, BankDetails bankDetails, ExtraInfoApplicant extraInfoApplicant) {
		super();
		this.applicantType = applicantType;
		this.idType = idType;
		this.idCountry = idCountry;
		this.idNumber = idNumber;
		this.address = address;
		this.address2 = address2;
		this.telephone1 = telephone1;
		this.telephone2 = telephone2;
		this.telephone3 = telephone3;
		this.email = email;
		this.bankDetails = bankDetails;
		this.setExtraInfoApplicant(extraInfoApplicant);
	}

	//set&get
	public String getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(String idCountry) {
		this.idCountry = idCountry;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress2() {
		return address2;
	}

	public void setAddress2(Address address2) {
		this.address2 = address2;
	}

	public String getTelephone1() {
		return telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public String getTelephone3() {
		return telephone3;
	}

	public void setTelephone3(String telephone3) {
		this.telephone3 = telephone3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public ExtraInfoApplicant getExtraInfoApplicant() {
		return extraInfoApplicant;
	}

	public void setExtraInfoApplicant(ExtraInfoApplicant extraInfoApplicant) {
		this.extraInfoApplicant = extraInfoApplicant;
	}

//	public List<NaturalApplicant> getNaturalApplicant() {
//		return naturalApplicant;
//	}
//
//	public void setNaturalApplicant(List<NaturalApplicant> naturalApplicant) {
//		this.naturalApplicant = naturalApplicant;
//	}
	
}
