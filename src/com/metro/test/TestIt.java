package com.metro.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.metro.domain.SmartCard;
import com.metro.domain.Station;
import com.metro.service.FareService;
import com.metro.service.IFareService;
import com.metro.service.IStationService;
import com.metro.service.ReportService;
import com.metro.service.StationService;
public class TestIt {
	
	private IFareService fService = new FareService(null); //TODO DI
	private IStationService sService = new StationService();
	private ReportService rService = new ReportService();
	
	
	@Test
	public void testMininumBal(){
		SmartCard card = new SmartCard();
		card.setCurrBal(-21);
		assertFalse(fService.hasMininumBal(card));
		
	}
	
	
	@Test
	public void testBalAfterDeduction(){
		SmartCard card = new SmartCard();
		card.setCurrBal(20);
		Station source = new Station(0);
		source.setId(2);
		
		Station dest = new Station(0);
		dest.setId(5);
		//System.out.println(fService.getDeductibleAmt(source, dest));
		//card.swipeOut(false,source, dest);
		//assertFalse(sService.swiped(false, source, dest, card));
		//assertFalse(fService.hasMininumBal(card));
		
	}
	
	@Test
	public void testCardReport(){
		
		SmartCard card = new SmartCard();
		card.setCurrBal(20);
		Station source = new Station(0);
		source.setId(2);		
		Station dest = new Station(0);
		dest.setId(5);
		//sService.swiped(true, source, dest, card);
		rService.showCardReport(card, source, dest);
	}
	
	@Test
	public void testStationFootFall(){
		
		SmartCard card = new SmartCard();
		card.setCurrBal(20);
		Station source = new Station(0);
		source.setId(2);		
		Station dest = new Station(0);
		dest.setId(5);
		//sService.swiped(true, source, dest, card);
		assertTrue(source.getFootfall() >=1);
	}
	
	@Test
	public void testSwipeIn(){
		SmartCard card = new SmartCard();
		card.setCurrBal(-21);
		assertFalse(fService.hasMininumBal(card));
		
	}

}
