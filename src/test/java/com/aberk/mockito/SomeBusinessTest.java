package com.aberk.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void testFindTheGreatest() {
		
		SomeBusinessImpl business = new SomeBusinessImpl( new DataServiceStub());
		int result = business.findTheGreatest();
		
		assertEquals(523, result);
	}
}

class DataServiceStub implements DataService{
	@Override
	public int[] retrieveAllData() {
		
		return new int[] {1,12,523,23};
	}
}
