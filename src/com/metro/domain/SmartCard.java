package com.metro.domain;

import com.metro.service.StationService;

public class SmartCard {
	
	private int id = 0;
	private double currBal = 5.5;
	private StationService stnService = new StationService();
	
	//private Station station = null;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the currBal
	 */
	public double getCurrBal() {
		return currBal;
	}
	/**
	 * @param currBal the currBal to set
	 */
	public void setCurrBal(double currBal) {
		this.currBal = currBal;
	}
	
	
	public void swipe(Boolean isEntry, Station source, Station destination, boolean isWeekend){
		String message = "Empty Message";
		boolean allOk = false;
		try{
			allOk = stnService.swiped(isEntry, source, destination, this, isWeekend);
			
			if(isEntry && !allOk)
				message = "Insufficient Balance, Please recharge.";
			else{
				message = "Blocked ! You exceeded amount in the card, Please contact supervisor.";
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(message);
	}
	
	/*public void swipeIn(Boolean isEntry, Station source, Station destination){
		this.swipe(isEntry, source, destination);
	}
	
	public void swipeOut(Boolean isEntry, Station source, Station destination){
		this.swipe(isEntry, source, destination);
	}*/
	
}
