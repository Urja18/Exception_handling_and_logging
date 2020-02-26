package com.urja_lohani;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestConstruction {
	private static final Logger lg= LogManager.getLogger(TestConstruction.class);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			lg.info("MENU");
			lg.info("Select the Material:");
			lg.info("	1.Standard Material");
			lg.info("	2.Above Standard Material");
			lg.info("	3.High Standard Material");
			lg.info("Enter your choice:");
			int material_standard=sc.nextInt();
			
			lg.info("Enter the square feet:");
			int square_feet=sc.nextInt();
			
			lg.info("Select Fully Automation:type (True) if Yes or (False)if No");
			boolean fully_automated=sc.nextBoolean();
			
			HouseConstruction houseConstruction=new HouseConstruction(material_standard, square_feet, fully_automated);
			double total_cost=houseConstruction.calculateCost();
			total_cost=houseConstruction.calculateCostAutomated();
			lg.info("The total cost is: "+total_cost);
	}
}


