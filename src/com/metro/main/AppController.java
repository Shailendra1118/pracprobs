package com.metro.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.metro.domain.SmartCard;
import com.metro.domain.Station;
import com.metro.domain.repository.StationRepo;
import com.metro.service.StationService;

public class AppController {

	static int numOfTravellers = 0; 
	static Station sourceStation = null;
	static Station destStation = null;
	static boolean isWeekend = false;
	static double cardBal = 0;
	public static void main(String[] args) {
		try {
			initSystem();
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem reading input...");
			e.printStackTrace();
		}
		
	}

	private static void initSystem() throws FileNotFoundException {
		/*
		 * Input assumptions from line no. of input file
		 * 1 - no. of travelers / individual test cases
		 * 2 - source and destination station
		 * 3 - isWeekend 1 for yes, 0 for no
		 * 4 - current balance in the card
		 */
		StationService service = new StationService(); 
		Scanner scanner = new Scanner(new File("D:/Keppler/CrazyCode/src/com/metro/main/input.txt"));
		numOfTravellers = scanner.nextInt();
		for(int i=0; i<numOfTravellers; i++){
			setJourney(scanner);
			SmartCard card = new SmartCard();
			card.setId(1111); //ideally read from Input file
			card.setCurrBal(cardBal);
			card.swipe(true, sourceStation, destStation, isWeekend); // true here means swipeIn and vice-versa
			card.swipe(false, sourceStation, destStation, isWeekend);
			//card.swipeOut(destStation);
			showCardReport(card, sourceStation, destStation);
		}
		scanner.close();
		
		//API for reporting - could be different service altogether
		//service = new StationService(); 
		System.out.println("FootFall of Station "+sourceStation.getId()+" is: "+
				service.getFootFallOfToday(sourceStation));
		System.out.println("FootFall of Station "+destStation.getId()+" is: "+
				service.getFootFallOfToday(destStation));
		
		
		
	}

	private static void showCardReport(SmartCard card, Station source, Station dest) {
		System.out.println("Card<"+card.getId()+"> used to travel from station "+source.getId()+""
				+ " to station "+dest.getId()+". Cur Balance is "+card.getCurrBal());
	}

	private static void setJourney(Scanner scanner) {
		int srcId = Integer.valueOf(scanner.next());
		int destId = Integer.valueOf(scanner.next());
		
		sourceStation =  StationRepo.getStationByCode("A"+srcId);  //new Station(srcId);
		destStation = StationRepo.getStationByCode("A"+destId); //new Station(destId);
		
		int weekend = scanner.nextInt();
		if(weekend == 1)
			isWeekend = true;
		
		cardBal = scanner.nextInt();
	}

}
