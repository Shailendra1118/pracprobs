package com.metro.service;

import com.metro.domain.SmartCard;
import com.metro.domain.Station;

public interface IStationService {

	public boolean swiped(Boolean isEntry, Station source, Station destionation, SmartCard card, boolean isWeekend);
	
	public int getFootFallOfToday(Station station);
}
