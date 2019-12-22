package com.nt.beans;
/**
 * 
 * contact service class will be created
 * @author Danish
 *
 */
public class ContactService {
	
	 IContactInfo cont;

	public void setCont(IContactInfo cont) {
		this.cont = cont;
	}
	
	public String getInfoById(int id) {
		String name = cont.getCustomer(id);
		return name;
		
	}
	
	private boolean isValidById(int id) {
		//logic
		return true;
	}
	
	

}
