package com.nit.beans;

public class WatherService {
	
	IWhatherInfo stub;

	public void setStub(IWhatherInfo stub) {
		this.stub = stub;
	}



	public double getTemprature(int zip) {
		
		double temp = stub.getInfoUsingZip(zip);
		
		return temp;
	}
	
	
	

}
