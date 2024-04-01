package com.example.demo.model;

public class NaturalApplicant extends Applicant{
	
	private boolean formatted;
	private String fullName;
	private String name;
	private String surName;
	private String surName2;
	private String nationality;
	private String gender;
	private String dateOfBirth; //ojo datetime
	private String maritalStatus;
	private EmploymentDetails employmentDetails;
	private String registrationDate; //ojo datetime
	
	
	public NaturalApplicant(){}
	
	public NaturalApplicant(boolean formatted, String fullName, String name,
			String surName, String surName2, String nationality, String gender,
			String dateOfBirth, String maritalStatus,
			EmploymentDetails employmentDetails, String registrationDate, String applicantType, String idType,
			String idCountry, String idNumber, Address address,
			Address address2, String telephone1, String telephone2,
			String telephone3, String email, BankDetails bankDetails,
			ExtraInfoApplicant extraInfoApplicant) {
		super(applicantType, idType, idCountry, idNumber, address, address2,
				telephone1, telephone2, telephone3, email, bankDetails,
				extraInfoApplicant);
		
		this.formatted = formatted;
		this.fullName = fullName;
		this.name = name;
		this.surName = surName;
		this.surName2 = surName2;
		this.nationality = nationality;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.setEmploymentDetails(employmentDetails);
		this.setRegistrationDate(registrationDate);
		
	}
	

	public boolean isFormatted() {
		return formatted;
	}

	public void setFormatted(boolean formatted) {
		this.formatted = formatted;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getSurName2() {
		return surName2;
	}
	public void setSurName2(String surName2) {
		this.surName2 = surName2;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public EmploymentDetails getEmploymentDetails() {
		return employmentDetails;
	}

	public void setEmploymentDetails(EmploymentDetails employmentDetails) {
		this.employmentDetails = employmentDetails;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	
}
