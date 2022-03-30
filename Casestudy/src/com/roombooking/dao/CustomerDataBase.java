package com.roombooking.dao;

//import java.sql.ResultSet;
//import java.sql.Statement;
import java.sql.*;

import com.roombooking.bean.Customer;


public class CustomerDataBase{

	public void customerSignup(Customer customer) throws  Exception{
		Statement statement = DataBaseConnection.dbConnection().createStatement();
		String query = "INSERT INTO customersignup VALUES('"+customer.getUserName()+"','"+Customer.getPassword()+"')";
		int rowsinsert = statement.executeUpdate(query);
		System.out.println("Loading...............");
		System.out.println("SIGN UP Completed:");
		DataBaseConnection.dbConnection().close();
	}
	public  static boolean customerlogin(String userName, String password) throws Exception{
		Statement statement = DataBaseConnection.dbConnection().createStatement();
		ResultSet rs = statement.executeQuery("select * from customersignup where userName='"+userName+"'"+"AND"+" password="+"'"+password+"'");

		if(rs.next())
			return true;
		else
			return false;
	}
	public static void  customerProfie(Customer customer)throws Exception{
		Statement statement = DataBaseConnection.dbConnection().createStatement();
		String query = "INSERT INTO customerProfile Values('"+customer.getFirstName()+"','"+customer.getLastName()+"','"+customer.getMobileNo()+"','"+customer.getEmailid()+"')";      
		int rowsinsert=statement.executeUpdate(query);
		System.out.println(rowsinsert + "  successfully inserted: ");
		
		 String query1 ="select firstname,lastname,mobileno,emailid from customerProfile where emailid='"+customer.getEmailid()+"'";
		 ResultSet rs1=statement.executeQuery(query1);
		 while(rs1.next()) {
			 System.out.println("YOUR DETAILS:");
			 System.out.println(rs1.getString("firstname"));
			 System.out.println(rs1.getString("lastname"));
			 System.out.println(rs1.getString("mobileno"));
			 System.out.println(rs1.getString("emailid"));
			 System.out.println(" ");
			 System.out.println(" ");

			 
		 }
		
		System.out.println(" Profile Updated Successfully: ");
		DataBaseConnection.dbConnection().close();
	}
	public static void customerSearch(Customer customer)throws Exception{
		Statement statement = DataBaseConnection.dbConnection().createStatement();
		if(customer.getLocation().toLowerCase().equals("perungudi")) {
			ResultSet rs = statement.executeQuery("select hostelname from hosteltable where  location='"+customer.getLocation().toLowerCase()+"'");
			System.out.println(" hostel available in  " +customer.getLocation());
			while(rs.next())
			{
				System.out.println(rs.getString("hostelname"));
			
				
				System.out.println();
			}
		}else {
			System.out.println("bad response Please enter correct location");
		DataBaseConnection.dbConnection().close();
		}
	}

	public static void Booking(Customer customer)throws Exception{
		Statement statement = DataBaseConnection.dbConnection().createStatement();
		String query = "INSERT INTO arhostel VALUES('"+customer.getMobileNo()+"','"+customer.getAadharNo()+"','"+customer.getAddress()+"')";
		int rowsinsert = statement.executeUpdate(query);
		
		 String query1 =" SELECT * from arhostel where address='"+customer.getAddress()+"'";
		 ResultSet rs1=statement.executeQuery(query1);
		 while(rs1.next()) {
			 System.out.println("YOUR DETAILS:");
			 System.out.println(rs1.getString("aadharno"));
			 System.out.println(rs1.getString("address"));
			 System.out.println(" Hostel Booked in  ARHOSTEL successfully :");
			 System.out.println(" ");
		 }
							
	
		DataBaseConnection.dbConnection().close();
	}
}
