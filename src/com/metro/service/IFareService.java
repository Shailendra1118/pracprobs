package com.metro.service;

import com.metro.domain.SmartCard;
import com.metro.domain.Station;

public interface IFareService {

	public double getMininumBal();
	public double getDeductibleAmt(Station source, Station destionation);
	boolean hasMininumBal(SmartCard card);
	
	
}
