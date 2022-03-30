package com.roombooking.bean;

public class Customer {
	public static String userName;
	private static String password;
	private String emailid;
	private String firstName;
	private String lastName;
	private static String mobileNo;
	private String location;
	private long aadharNo;
	private String address;
	public static String pgname;
	public Customer() {}
	public Customer(String userName, String password, String emailid, String firstName, String lastName,
			String mobileNo, String location,  long aadharNo,String address,String pgname) {
		super();
		Customer.userName = userName;
		Customer.password = password;
		this.emailid = emailid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.location = location;
		this.aadharNo = aadharNo;
		this.pgname=pgname;
		this.address=address;
	}
	public static String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		Customer.userName = userName;
	}
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		Customer.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public static  String getPgname() {
		return pgname;
	}
	public void setPgname(String pgname) {
		this.pgname=pgname;
	}


}
