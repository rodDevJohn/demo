package com.example.demo.model;

//import javax.xml.bind.annotation.XmlElement;



public class Address {

	private boolean formatted;
	private String fullAddress;
	private String streetType;
	private String streetName;
	private String streetNumber;
	private String streetMoreInfo;
	private String postCode;
	private String county;
	private String district;
	private String country;
	private ExtraInfoAddress extraInfoAddress;
	
	
	public Address() {
		
	}
	
	public Address(boolean formatted, String fullAddress, String streetType,
			String streetName, String streetNumber, String streetMoreInfo,
			String postCode, String county, String district, String country, ExtraInfoAddress extraInfoAddress) {
	
		this.formatted = formatted;
		this.fullAddress = fullAddress;
		this.streetType = streetType;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.streetMoreInfo = streetMoreInfo;
		this.postCode = postCode;
		this.county = county;
		this.district = district;
		this.country = country;
		this.setExtraInfoAddress(extraInfoAddress);
	}

	
	public boolean isFormatted() {
		return formatted;
	}
	
	public void setFormatted(boolean formatted) {
		this.formatted = formatted;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getStreetType() {
		return streetType;
	}
	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetMoreInfo() {
		return streetMoreInfo;
	}
	public void setStreetMoreInfo(String streetMoreInfo) {
		this.streetMoreInfo = streetMoreInfo;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public ExtraInfoAddress getExtraInfoAddress() {
		return extraInfoAddress;
	}

	public void setExtraInfoAddress(ExtraInfoAddress extraInfoAddress) {
		this.extraInfoAddress = extraInfoAddress;
	}

}
