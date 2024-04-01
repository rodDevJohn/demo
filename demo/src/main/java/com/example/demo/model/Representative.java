package com.example.demo.model;

public class Representative {
	private String representiveType;
	private String idType;
	private String idCountry;
	private String idNumber;
	private String email;
	private String telephone;
	private String authorityData;
	private ExtraInfoRepresentative extraInfoRepresentative;
	
	public Representative(){}

	
	public String getRepresentiveType() {
		return representiveType;
	}

	public void setRepresentiveType(String representiveType) {
		this.representiveType = representiveType;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAuthorityData() {
		return authorityData;
	}

	public void setAuthorityData(String authorityData) {
		this.authorityData = authorityData;
	}

	public ExtraInfoRepresentative getExtraInfoRepresentative() {
		return extraInfoRepresentative;
	}

	public void setExtraInfoRepresentative(
			ExtraInfoRepresentative extraInfoRepresentative) {
		this.extraInfoRepresentative = extraInfoRepresentative;
	}
	
}
