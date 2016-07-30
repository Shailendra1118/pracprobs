package com.metro.service;

import com.metro.domain.SmartCard;
import com.metro.domain.Station;

public class ReportService {
	
	public void showCardReport(SmartCard card, Station source, Station dest) {
		System.out.println("Card<"+card.getId()+"> used to travel from station "+source.getId()+""
				+ " to station "+dest.getId()+". Cur Balance is "+card.getCurrBal());
	}

}
