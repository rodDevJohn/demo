/**
 * 
 */
package com.example.demo.model;

/**
 * @author SE11318
 *
 */
public class ExtraInfoAddress {
	
	private String address_category;


	public ExtraInfoAddress (){}

	public ExtraInfoAddress(String address_category) {
		this.address_category = address_category;
	}

	
	public String getAddress_category() {
		return address_category;
	}

	public void setOwnership_type(String address_category) {
		this.address_category = address_category;
	}

	
}
