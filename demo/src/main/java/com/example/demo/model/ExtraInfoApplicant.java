package com.example.demo.model;

public class ExtraInfoApplicant {
	
	private String birth_country;
	private String category_tel1;
	private String category_tel2;
	private String category_tel3;
	//Class pdf java con  pdfbox-2.0.8.pom
	private String document_support_number;
	
	public ExtraInfoApplicant() {

	}
	
	public ExtraInfoApplicant(String birth_country, String category_tel1,
			String category_tel2, String category_tel3, String document_support_number) {
		super();
		this.birth_country = birth_country;
		this.category_tel1 = category_tel1;
		this.category_tel2 = category_tel2;
		this.category_tel3 = category_tel3;
		this.setDocument_support_number(document_support_number);
	}
	
	public String getBirth_country() {
		return birth_country;
	}
	
	public void setBirth_country(String birth_country) {
		this.birth_country = birth_country;
	}
	public String getCategory_tel1() {
		return category_tel1;
	}
	public void setCategory_tel1(String category_tel1) {
		this.category_tel1 = category_tel1;
	}
	public String getCategory_tel2() {
		return category_tel2;
	}
	public void setCategory_tel2(String category_tel2) {
		this.category_tel2 = category_tel2;
	}
	public String getCategory_tel3() {
		return category_tel3;
	}
	public void setCategory_tel3(String category_tel3) {
		this.category_tel3 = category_tel3;
	}

	public String getDocument_support_number() {
		return document_support_number;
	}

	public void setDocument_support_number(String document_support_number) {
		this.document_support_number = document_support_number;
	}
	
	
}
