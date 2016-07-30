package com.metro.service;

import com.metro.domain.SmartCard;
import com.metro.domain.Station;
import com.metro.rates.Rate;

public class FareService implements IFareService{
	
	public FareService(Rate rate){
		this.rate = rate;
	}
	//private double currFair = 10; //TODO should be fetch from API/third party
	private Rate rate = null;
	private double minBal = 5.5;
	
	@Override
	public double getMininumBal() {
		return minBal;
	}

	
	@Override
	public double getDeductibleAmt(Station source, Station destionation) {
		int traveledStations = Math.abs(destionation.getId() - source.getId()); //assumption
		
		double calFair = traveledStations * rate.getCurrentRate();
		return calFair;
	}


	@Override
	public boolean hasMininumBal(SmartCard card) {
		if(card.getCurrBal() >= minBal)
			return true;
		
		return false;
	}

}
