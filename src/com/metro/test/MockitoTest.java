package com.metro.test;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.metro.domain.SmartCard;
import com.metro.service.IFareService;

public class MockitoTest {

	@Mock
	private IFareService fService; // = new FareService(null);
	//@Mock
	//private SmartCard card;
	
	@Rule
	public MockitoRule mockitRule = MockitoJUnit.rule();
	
	
	@Test
	public void isSufficientBal(){
		SmartCard card = new SmartCard();
		//Mockito.when(card.getCurrBal()).thenReturn((double) 6);
		//Mockito.when(fService.hasMininumBal(card));
		//card.setCurrBal(-20);		
		Mockito.when(fService.hasMininumBal(card)).thenReturn(true);
		assertTrue(fService.hasMininumBal(card));
		Mockito.verify(fService).hasMininumBal(card); // Obviously verification happens after call right
	}
}
