package com.bridgelabz.addressbook;

import java.util.Scanner;

public class contacts {
	public static void contact(){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter your First name and last name : ");
		 String name = sc.nextLine();
		 
		 System.out.println("Enter your Address : ");
		 String address = sc.nextLine();
		 
		 System.out.println("Enter your City : ");
		 String city = sc.nextLine();

		 System.out.println("Enter your State : ");
		 String state = sc.nextLine();
		 
		 System.out.println("Enter your Zip-Code : ");
		 long zip = sc.nextLong();
		 
		 System.out.println("Enter your Phone Number : ");
		 long phoneNum = sc.nextLong();
		 
		 System.out.println("Enter your Email : ");
		 String email = sc.nextLine();
		
		  
	}
}
