package com.metro.domain.repository;

import java.util.HashMap;

import com.metro.domain.Station;

public class StationRepo {
	
	static HashMap<String,Station> stnMap = new HashMap<>();
	static{
		stnMap.put("A1", new Station(1));
		stnMap.put("A2", new Station(2));
		stnMap.put("A3", new Station(3));
		stnMap.put("A4", new Station(4));
		stnMap.put("A5", new Station(5));
		stnMap.put("A6", new Station(6));
		stnMap.put("A7", new Station(7));
		stnMap.put("A8", new Station(8));
		stnMap.put("A9", new Station(9));
		stnMap.put("A10", new Station(10));
	}
	
	public static Station getStationByCode(String code){
		return stnMap.get(code);
	}
	
	
	
}
