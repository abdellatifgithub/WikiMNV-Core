package fr.cap.wikimnv.core.pojo;

import org.mongojack.Id;
import org.mongojack.ObjectId;

public class User {
	
	private String userName;
	private String userPassword;
	private String businessCategory;
	private String telephoneNumber;
	private String internationaliSDNNumber;
	private String street;
	private String postOfficeBox;
	private String postalCode;
	private String postalAddress;	
	public boolean bannit;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getBusinessCategory() {
		return businessCategory;
	}

	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getInternationaliSDNNumber() {
		return internationaliSDNNumber;
	}

	public void setInternationaliSDNNumber(String internationaliSDNNumber) {
		this.internationaliSDNNumber = internationaliSDNNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostOfficeBox() {
		return postOfficeBox;
	}

	public void setPostOfficeBox(String postOfficeBox) {
		this.postOfficeBox = postOfficeBox;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	
	public void setBannit(boolean b) {
		this.bannit = b;		
	}
	
	public boolean isBannit(){
		return bannit;
	}
	
	public User() {
		setBannit(false);
	}

}
