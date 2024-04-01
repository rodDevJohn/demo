package com.example.demo.model;


public class Application {
	private String guid;
	private String entityCode; //puede ir hacia bbdd(empresa??)
	private String entitySectorActivity;
	private String entityUser;
	private String requestNumber; //puede ir hacia bbdd(ID solicitud???)
	private String requestDate; //AAAA-MM-DD hh:mm:ss:sssZ (también hh:mm:sssZ)--> Ha de ser dateTime ojo -puede ir hacia bbdd(fecha solicitud y hora de solicitud)
	private String productType; //puede ir hacia bbdd(tipo producto)
	private String channel; //puede ir hacia bbdd(canal)
	private String ipAddress; //puede ir hacia bbdd(ÌP???)
	private String ipAddressCountry; //puede ir hacia bbdd(país IP??)
	private String mainApplicantType;
	private boolean allowToShareFlag;
	private boolean externalRequest;
	private double requestedAmount;
	private String prescriptorCountry;
	private String prescriptorPostCode; 
	private String prescriptorID;
	private String prescriptorDescription;
	private String prescriptorInternalCode;
	private String presentialBranchCode; //puede ir hacia bbdd(Oficina??)
	private String presentialBranchPostCode; ////puede ir hacia bbdd(CP oficina??)

	private ExtraInfoApplication extraInfoApplication;
	
//	@SerializedName("applicants")
//	private List<Applicant> applicantss;
	
	public Application(){}
	
	public Application(String guid, String entityCode,
			String entitySectorActivity, String entityUser,
			String requestNumber, String requestData, String productType,
			String channel, String ipAddress, String ipAddressCountry,
			String mainApplicantType, boolean allowToShareFlag,
			boolean externalRequest, double requestedAmount,
			String prescriptorCountry, String prescriptorPostCode,
			String prescriptorID, String prescriptorDescription,
			String prescriptorInternalCode, String presentialBranchCode,
			String presentialBranchPostCode, ExtraInfoApplication extraInfoApplication) {

		this.guid = guid;
		this.entityCode = entityCode;
		this.entitySectorActivity = entitySectorActivity;
		this.entityUser = entityUser;
		this.requestNumber = requestNumber;
		this.requestDate = requestData;
		this.productType = productType;
		this.channel = channel;
		this.ipAddress = ipAddress;
		this.ipAddressCountry = ipAddressCountry;
		this.mainApplicantType = mainApplicantType;
		this.allowToShareFlag = allowToShareFlag;
		this.externalRequest = externalRequest;
		this.requestedAmount = requestedAmount;
		this.prescriptorCountry = prescriptorCountry;
		this.prescriptorPostCode = prescriptorPostCode;
		this.prescriptorID = prescriptorID;
		this.prescriptorDescription = prescriptorDescription;
		this.prescriptorInternalCode = prescriptorInternalCode;
		this.presentialBranchCode = presentialBranchCode;
		this.presentialBranchPostCode = presentialBranchPostCode;
		this.extraInfoApplication = extraInfoApplication;
//		this.setApplicants(applicants);
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getEntityCode() {
		return entityCode;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getEntitySectorActivity() {
		return entitySectorActivity;
	}

	public void setEntitySectorActivity(String entitySectorActivity) {
		this.entitySectorActivity = entitySectorActivity;
	}

	public String getEntityUser() {
		return entityUser;
	}

	public void setEntityUser(String entityUser) {
		this.entityUser = entityUser;
	}

	public String getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(String requestNumber) {
		this.requestNumber = requestNumber;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getIpAddressCountry() {
		return ipAddressCountry;
	}

	public void setIpAddressCountry(String ipAddressCountry) {
		this.ipAddressCountry = ipAddressCountry;
	}

	public String getMainApplicantType() {
		return mainApplicantType;
	}

	public void setMainApplicantType(String mainApplicantType) {
		this.mainApplicantType = mainApplicantType;
	}

	public boolean isAllowToShareFlag() {
		return allowToShareFlag;
	}

	public void setAllowToShareFlag(boolean allowToShareFlag) {
		this.allowToShareFlag = allowToShareFlag;
	}

	public boolean isExternalRequest() {
		return externalRequest;
	}

	public void setExternalRequest(boolean externalRequest) {
		this.externalRequest = externalRequest;
	}

	public double getRequestedAmount() {
		return requestedAmount;
	}

	public void setRequestedAmount(double requestedAmount) {
		this.requestedAmount = requestedAmount;
	}

	public String getPrescriptorCountry() {
		return prescriptorCountry;
	}

	public void setPrescriptorCountry(String prescriptorCountry) {
		this.prescriptorCountry = prescriptorCountry;
	}

	public String getPrescriptorPostCode() {
		return prescriptorPostCode;
	}

	public void setPrescriptorPostCode(String prescriptorPostCode) {
		this.prescriptorPostCode = prescriptorPostCode;
	}

	public String getPrescriptorID() {
		return prescriptorID;
	}

	public void setPrescriptorID(String prescriptorID) {
		this.prescriptorID = prescriptorID;
	}

	public String getPrescriptorDescription() {
		return prescriptorDescription;
	}

	public void setPrescriptorDescription(String prescriptorDescription) {
		this.prescriptorDescription = prescriptorDescription;
	}

	public String getPrescriptorInternalCode() {
		return prescriptorInternalCode;
	}

	public void setPrescriptorInternalCode(String prescriptorInternalCode) {
		this.prescriptorInternalCode = prescriptorInternalCode;
	}

	public String getPresentialBranchCode() {
		return presentialBranchCode;
	}

	public void setPresentialBranchCode(String presentialBranchCode) {
		this.presentialBranchCode = presentialBranchCode;
	}

	public String getPresentialBranchPostCode() {
		return presentialBranchPostCode;
	}

	public void setPresentialBranchPostCode(String presentialBranchPostCode) {
		this.presentialBranchPostCode = presentialBranchPostCode;
	}

	public ExtraInfoApplication getExtraInfoApplication() {
		return extraInfoApplication;
	}

	public void setExtraInfoApplication(ExtraInfoApplication extraInfoApplication) {
		this.extraInfoApplication = extraInfoApplication;
	}

//	public List<Applicant> getApplicants() {
//		return applicants;
//	}
//
//	public void setApplicants(List<Applicant> applicants) {
//		this.applicants = applicants;
//	}
}
