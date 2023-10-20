package com.sunbeam;

public class Labor implements Emp {
	private double hours;
	private double rate;
	
	
	public Labor(double hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		
		return this.hours*this.rate;
	}
	
	@Override
	public double calcIncentives() {
		if(this.hours>300)
		return 0.05*this.getSal();
		return 0.0;
	}
}
