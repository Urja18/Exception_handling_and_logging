package com.urja_lohani;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestIntrest {
	public static final Logger lg=LogManager.getLogger(TestIntrest.class);
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int principle;
		double rate,time;
		while(true)
		{
			lg.info("MENU");
			System.out.println("1.Simple Interest");
			System.out.println("2.Compound Interest");
			System.out.println("3.Exit");
			System.out.println("Enter your choice ");
			int choice=sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 System.out.println("Enter principal,rate of interest and time: ");
					principle=sc.nextInt();
					rate=sc.nextDouble();
					time=sc.nextDouble();
				 SimpleIntrest simpleinterest=new SimpleIntrest(principle, rate, time);
				 System.out.println("Simple Interest is: "+simpleinterest.calculateInterest());
				 break;
			 case 2:
				 lg.info("Enter principal,rate of interest and time: ");
					principle=sc.nextInt();
					rate=sc.nextDouble();
					time=sc.nextDouble();
				 CompoundIntrest compoundinterest=new CompoundIntrest(principle, rate, time);
				 lg.info("Compound Interest is: "+compoundinterest.calculateInterest());
				 break;
			 case 3:
				 lg.info("ThankYou");
				 System.exit(0);
			default:
				lg.warn("Invlaid Choice!!Try Again!");
			 }
		}

	}
	
	}






