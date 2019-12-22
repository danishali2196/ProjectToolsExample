package com.nit.beans;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

public class WatherServiceTest {

	@Test
	public void testGetTemprature() {
		WatherService service = new WatherService();

		IWhatherInfo stub = EasyMock.createMock(IWhatherInfo.class);

		EasyMock.expect(stub.getInfoUsingZip(10010)).andReturn(45.02);
		EasyMock.expect(stub.getInfoUsingZip(10012)).andReturn(40.52);
		EasyMock.expect(stub.getInfoUsingZip(10013)).andReturn(37.09);
		EasyMock.replay(stub);

		service.setStub(stub);

		double temprature = service.getTemprature(10010);
		System.out.println(temprature);
		assertNotNull(temprature);
	}

}
