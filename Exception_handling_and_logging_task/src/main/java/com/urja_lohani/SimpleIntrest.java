package com.urja_lohani;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public  class SimpleIntrest  implements SimpleCompoundIntrest {
private static final Logger lg = (Logger) LogManager.getLogger(SimpleIntrest.class);
	int principle;
	double rate,time;
	
	public SimpleIntrest(int principle, double rate, double time) {
		super();
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}
	
	public double calculateIntrest() {
		lg.info("WE CALCULATE SIMPLEINTREST HERE");
		double simpleinterest=((principle*rate*time)/100.0);
		return simpleinterest;
	}

	public double calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

}



