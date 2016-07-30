package com.metro.service;

import com.metro.domain.SmartCard;
import com.metro.domain.Station;
import com.metro.rates.WeekdayRate;
import com.metro.rates.WeekendRate;

public class StationService implements IStationService {
	
	private IFareService fareService = null; // TODO implement Dependency injection
	
	public boolean swiped(Boolean isEntry, Station source, Station destionation, SmartCard card, boolean isWeekend){
		boolean allOk = true;
		if(isEntry){
			if(card.getCurrBal() > fareService.getMininumBal()){
				//allowed to enter
				source.setFootfall(source.getFootfall()+1);
			}else{
				allOk = false;
			}
				
		}
		
		// getting out
		if(isWeekend)
			fareService = new FareService(new WeekendRate());
		else
			fareService = new FareService(new WeekdayRate());
		
		double fair = fareService.getDeductibleAmt(source, destionation);
		card.setCurrBal(card.getCurrBal() - fair);
		destionation.setFootfall(destionation.getFootfall()+1);
		//check to block traveler
		if(card.getCurrBal() <0){
			allOk = false;
		}

		return allOk;
		
	}

	@Override
	public int getFootFallOfToday(Station station) {
		return station.getFootfall();
	}

}
