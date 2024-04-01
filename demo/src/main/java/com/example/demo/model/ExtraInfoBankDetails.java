/**
 * 
 */
package com.example.demo.model;

/**
 * @author SE11318
 *
 */
public class ExtraInfoBankDetails {
	
	private String ownership_type;
	private String registration_date;

	
	public ExtraInfoBankDetails (){}

	public ExtraInfoBankDetails(String ownership_type, String registration_date) {
		super();
		this.ownership_type = ownership_type;
		this.registration_date = registration_date;
	}

	
	public String getOwnership_type() {
		return ownership_type;
	}

	public void setOwnership_type(String ownership_type) {
		this.ownership_type = ownership_type;
	}

	public String getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}
	
}
