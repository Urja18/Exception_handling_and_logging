package com.urja_lohani;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundIntrest  implements SimpleCompoundIntrest {
private static final Logger lg= LogManager.getLogger(CompoundIntrest.class);
	int principle;
	double rate,time;
	
	public CompoundIntrest(int principle, double rate, double time) {
		super();
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}
	
	public double calculateInterest() {
		lg.info("WE CALCULATE COMPOUND INTREST HERE");
		double compoundinterest=principle*(Math.pow(1+(rate/100), time));
		return compoundinterest;
	}


}
