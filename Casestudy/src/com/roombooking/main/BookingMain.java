
package com.roombooking.main;

import java.util.Scanner;

import com.roombooking.bean.Customer;
import com.roombooking.dao.CustomerDataBase;
import com.roombooking.service.Authentication;


public class BookingMain {
	

	
	public static void main(String[] args) throws Exception   {
		Customer customer = new Customer();
		Authentication auth = new Authentication();
		Scanner sc=new Scanner(System.in);
		CustomerDataBase database = new CustomerDataBase();
		try {
			for(int i=1;i<=20;i++)
		{
				
			System.out.println("-------------------->welome to PG Room Booking:<----------------");  
			System.out.println("Option 1: SIGN UP:");
			System.out.println("Option 2: Login Operation:");
			System.out.println("Option 3: Profile Update:");
			System.out.println("Option 4: Search Hostel Operation:");
			System.out.println("option 5: Room Booking Operation:");
			System.out.println("option 6: Logout  :");



			System.out.println("Please enter response:");
			int resp=sc.nextInt();
			switch(resp)
			{
			case 1:
				database.customerSignup(auth.signup());
				break;
			case 2:
				auth.login();
				break;
			case 3:
				database.customerProfie(auth.Profile());
				break;
			case 4:
				System.out.println("Search for Hostels   ");
				database.customerSearch(auth.Search());
				break;
			case 5:
				System.out.println("Welcome to Booking Page:");
				database.Booking(auth.Booking());
				break;
			case 6:
				//auth.Logout();
				System.out.println("Thank you Exit from booking app:");
				System.exit(0);
				break;
			default:
				System.out.println(" Bad Response ");
				break;

			}
		}
		sc.close();
		}catch(Exception e)
		{
		System.out.println("Hello Bad Response Can't Process Further Please Rerun The Program:");
		}
	}


}











				
