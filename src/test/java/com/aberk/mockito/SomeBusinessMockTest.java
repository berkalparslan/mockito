package com.aberk.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	void testFindTheGreatest() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3,5,324,523});
		
		SomeBusinessImpl business = new SomeBusinessImpl( dataServiceMock);
		int result = business.findTheGreatest();
		assertEquals(523, result);
	}
	@Test
	void testFindTheGreatest2() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3,5,2,33});
		
		SomeBusinessImpl business = new SomeBusinessImpl( dataServiceMock);
		int result = business.findTheGreatest();
		assertEquals(33, result);
	}
}
