package com.roombooking.service;

import java.util.Scanner;

import com.roombooking.bean.Customer;
import com.roombooking.dao.CustomerDataBase;

public class Authentication {
	static Customer customer = new Customer();
	static Scanner scan = new Scanner(System.in);
	public Customer signup()
	{
		System.out.println("enter username");
		String userName=scan.nextLine();
		customer.setUserName(userName);
		System.out.println("enter password");
		String password=scan.nextLine();
		customer.setPassword(password);
		return customer;

	}
	public void login() throws Exception
	{
		for(int i=1;i<3;i++) {
			System.out.println("enter your username");
			String userName=scan.nextLine();
			System.out.println("enter password");
			String password = scan.nextLine();
			CustomerDataBase customerdatabase = new CustomerDataBase();
			boolean bool = customerdatabase.customerlogin(userName, password);
			if(bool== true) {
				System.out.println("Login Successful");
				break;
			}
			else {
				System.out.println("Login Failed Check Your User Name And Password:");
			}

		}
	}
	public Customer Profile()
	{
		System.out.println("enter first name");
		String firstName= scan.nextLine();
		customer.setFirstName(firstName);
		System.out.println("enter last name");
		String lastName= scan.nextLine();
		customer.setLastName(lastName);
		System.out.println("enter mobile number:");
		String mobileNO= scan.nextLine();
		customer.setMobileNo(mobileNO);
		System.out.println("enter email Id:");
		String emailId= scan.nextLine();
		customer.setEmailid(emailId);
		return customer;
	}
	public Customer  Search()
	{
		System.out.println("enter location to search:");
		String location =scan.next();
		customer.setLocation(location);
		return customer;
	}
	public static Customer Booking()
	{
	    System.out.println("Enter PG Name:");
		String pgname=scan.next();
		String pname = "arhostel";
		if(pname.equals(pgname))
		{
			customer.setFirstName(pgname);
			System.out.println("enter aadhar number: ");
			long aadharNo=scan.nextLong();
			customer.setAadharNo(aadharNo);
			System.out.println("enter address:");
			String address=scan.next();
			customer.setAddress(address);
			System.out.println("enter mobilenumber:");
			String mobileNo=scan.next();
			customer.setMobileNo(mobileNo);
			
		}
		else
		{
			System.out.println(" Sorry No hostel available...........");
			Booking();
		}
		
		
		
		
		return customer;
	}


}





