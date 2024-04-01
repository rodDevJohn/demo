package com.example.demo.model;

public class BankDetails {

	private String bankCode;
	private String branchCode;
	private String checkDigits;
	private String bankAccountNumber;
	private String fullBankAccount;
	private ExtraInfoBankDetails extraInfoBankDetails;
	
	
	public BankDetails(){}
	
	public BankDetails(String bankCode, String branchCode, String checkDigits,
			String bankAccountNumber, String fullBankAccount, ExtraInfoBankDetails extraInfoBankDetails) {
		super();
		this.bankCode = bankCode;
		this.branchCode = branchCode;
		this.checkDigits = checkDigits;
		this.bankAccountNumber = bankAccountNumber;
		this.fullBankAccount = fullBankAccount;
		this.extraInfoBankDetails = extraInfoBankDetails;
	}
	
	//get%set
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getCheckDigits() {
		return checkDigits;
	}
	public void setCheckDigits(String checkDigits) {
		this.checkDigits = checkDigits;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getFullBankAccount() {
		return fullBankAccount;
	}
	public void setFullBankAccount(String fullBankAccount) {
		this.fullBankAccount = fullBankAccount;
	}

	public ExtraInfoBankDetails getExtraInfoBankDetails() {
		return extraInfoBankDetails;
	}

	public void setExtraInfoBankDetails(ExtraInfoBankDetails extraInfoBankDetails) {
		this.extraInfoBankDetails = extraInfoBankDetails;
	}
	
}
