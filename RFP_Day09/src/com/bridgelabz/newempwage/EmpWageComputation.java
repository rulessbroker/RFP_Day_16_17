package com.bridgelabz.newempwage;

import java.util.Random;

import java.util.Scanner;

public class EmpWageComputation {
	public static void main(String[] args) {
		System.out.println("*****Welcome To Employee Wage Computation*****");
		
		Scanner input = new Scanner(System.in);
		
		 Company company1 = new Company("Desault", (short) 45, (short) 18, (short) 120);
		    System.out.println(company1);

		    Company company2 = new Company("Rolls Royals", (short) 50, (short) 15, (short) 150);
		    System.out.println(company2);
		
		  System.out.print("\nEnter company name ==> ");
		    String companyName = input.nextLine();

		    System.out.print("Enter the company wage per hour =");
		    int wagePerHr = input.nextShort();

		    System.out.print("Enter the number of days to work per month = ");
		    int daysToWork = input.nextShort();

		    System.out.print("Enter the number of hours per month = ");
		    int hrsToWork = input.nextShort();
		    input.close();
		
		Company name = new Company(companyName, wagePerHr, daysToWork, hrsToWork);
		System.out.println(name);
		
	}
}

 class Company{
	static short fullTimeHrs = 10;
	static short partTimeHrs = 3;
	String companyName = " ";
	int wagePerHr;
	int daysToWork;
	int hrsToWork;
	int monthlywage;
	int totlaHrsWorked;
	int totalDaysWorked;
	
	 public Company(String companyName, int wagePerHr, int daysToWork, int hrsToWork) {
		    this.companyName = companyName;
		    this.wagePerHr = wagePerHr;
		    this.daysToWork = daysToWork;
		    this.hrsToWork = hrsToWork;
		    calculateEmpWage();

}
	 public String toString() {
		return  "\n Employee worked in " + companyName + " has made " + monthlywage + " Rs by working " + totlaHrsWorked + " hours in " + totalDaysWorked + " days this month ";
		
	 }
	 
	 void calculateEmpWage() {

		    System.out.print("\nEmployee daily wage ");

		    while (totalDaysWorked < daysToWork && totlaHrsWorked < hrsToWork) {
		      int dailyWage = getDailyWage(wagePerHr); 

		      System.out.print(dailyWage + " ");

		      String str = (dailyWage == 0) ? "absent" : dailyWage / wagePerHr == Company.fullTimeHrs ? "full time" : "part time";

		      switch (str) {
		        case "full time":
		          totlaHrsWorked += Company.fullTimeHrs;
		          totalDaysWorked++;
		          break;
		        case "part time":
		          totlaHrsWorked += Company.partTimeHrs;
		          totalDaysWorked++;
		          break;
		      }
		    }
		    monthlywage = totlaHrsWorked * wagePerHr;

		  }

		  int getDailyWage(int wagePerHr) {

		    int hrsWorked = 0;

		    String str = checkAttendance();

		    if (str.contains("full time")) hrsWorked = Company.fullTimeHrs;
		    else if (str.contains("part time")) hrsWorked = Company.partTimeHrs;

		    int dailyWage = wagePerHr * hrsWorked;
		    return dailyWage;
		  }

		  String checkAttendance() {
			  
		    Random random = new Random();
		    int randomNum = random.nextInt(3);

		    switch (randomNum) {
		      case 1:
		        return "employee is present full time";

		      case 2:
		        return "employee is present part time";

		      default:
		        return "employee is absent";
		    }
		  }

		}

 
