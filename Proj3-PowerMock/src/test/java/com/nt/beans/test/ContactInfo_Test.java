package com.nt.beans.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import org.mockito.Mockito;

import com.nt.beans.ContactService;
import com.nt.beans.IContactInfo;

@RunWith(PowerMockRunner.class)
@PrepareForTest({IContactInfo.class})
public class ContactInfo_Test {
	
	@Test
	public void getInfoTest() {
		ContactService service = new ContactService();
		
		IContactInfo info = PowerMockito.mock(IContactInfo.class);
				
		Mockito.when(info.getCustomer(100)).thenReturn("danish");
		Mockito.when(info.getCustomer(101)).thenReturn("raja");
		
		service.setCont(info);
		String name = service.getInfoById(101);
		assertNotNull(name);
		
		}
	
	@Test
	public void isValidTest() throws Exception{
		ContactService service = new ContactService();
		
	  	boolean result = (boolean)Whitebox.invokeMethod(service, "isValidById",  100);
		
	  	assertTrue(result);
	
	}

}
