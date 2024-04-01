package com.example.demo.model;


public class EmploymentDetails {
	
	private String employerName;
	private String employerIDType;
	private String employerID; 
	private String employerIDCountry;
	private String employerActivity;
	private String employmentCategory; 
	private String employmentSituation;
	private double annualIncome;
	private String employmentType;
	private String employmentStartDate; //ojo datetime
	private ExtraInfoEmploymentDetails extraInfoEmploymentDetails;
	
	
	public EmploymentDetails(){
	}


	public EmploymentDetails(String employerName, String employerIDType,
			String employerID, String employerIDCountry,
			String employerActivity, String employmentCategory,
			String employmentSituation, double annualIncome,
			String employmentType, String employmentStartDate,
			ExtraInfoEmploymentDetails extraInfoEmploymentDetails) {
		super();
		this.employerName = employerName;
		this.employerIDType = employerIDType;
		this.employerID = employerID;
		this.employerIDCountry = employerIDCountry;
		this.employerActivity = employerActivity;
		this.employmentCategory = employmentCategory;
		this.employmentSituation = employmentSituation;
		this.annualIncome = annualIncome;
		this.employmentType = employmentType;
		this.employmentStartDate = employmentStartDate;
		this.extraInfoEmploymentDetails = extraInfoEmploymentDetails;
	}


	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployerIDType() {
		return employerIDType;
	}

	public void setEmployerIDType(String employerIDType) {
		this.employerIDType = employerIDType;
	}

	public String getEmployerID() {
		return employerID;
	}

	public void setEmployerID(String employerID) {
		this.employerID = employerID;
	}

	public String getEmployerIDCountry() {
		return employerIDCountry;
	}

	public void setEmployerIDCountry(String employerIDCountry) {
		this.employerIDCountry = employerIDCountry;
	}

	public String getEmployerActivity() {
		return employerActivity;
	}

	public void setEmployerActivity(String employerActivity) {
		this.employerActivity = employerActivity;
	}

	public String getEmploymentCategory() {
		return employmentCategory;
	}

	public void setEmploymentCategory(String employmentCategory) {
		this.employmentCategory = employmentCategory;
	}

	public String getEmploymentSituation() {
		return employmentSituation;
	}

	public void setEmploymentSituation(String employmentSituation) {
		this.employmentSituation = employmentSituation;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getEmploymentStartDate() {
		return employmentStartDate;
	}

	public void setEmploymentStartDate(String employmentStartDate) {
		this.employmentStartDate = employmentStartDate;
	}

	public ExtraInfoEmploymentDetails getExtraInfoEmploymentDetails() {
		return extraInfoEmploymentDetails;
	}

	public void setExtraInfoEmploymentDetails(
			ExtraInfoEmploymentDetails extraInfoEmploymentDetails) {
		this.extraInfoEmploymentDetails = extraInfoEmploymentDetails;
	}
	
}
