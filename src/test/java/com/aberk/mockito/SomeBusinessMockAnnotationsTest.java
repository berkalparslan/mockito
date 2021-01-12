package com.aberk.mockito;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class SomeBusinessMockAnnotationsTest {

	@Mock
	DataService dataServiceMock; //DataService dataServiceMock = mock(DataService.class);
	
	@InjectMocks
	SomeBusinessImpl business; // SomeBusinessImpl business = new SomeBusinessImpl( dataServiceMock);
	
	@Test
	void testFindTheGreatest() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 ,3 });	
		assertEquals(15, business.findTheGreatest());
	}
}
