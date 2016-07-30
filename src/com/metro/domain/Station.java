package com.metro.domain;

import java.util.ArrayList;
import java.util.List;

public class Station {
	
	public Station(int id){
		this.id = id;
		this.name = "A"+id;
	}
	
	private int id = 0;
	
	private String name = "";
	private int footfall = 0;
	private List<SmartCard> registry = new ArrayList<>();
	//private List<SmartCard> destinationList = new ArrayList<>();
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the foot-fall
	 */
	public int getFootfall() {
		return footfall;
	}
	/**
	 * @param footfall the foot-fall to set
	 */
	public void setFootfall(int footfall) {
		this.footfall = footfall;
	}
	/**
	 * @return the asSource
	 */

	public List<SmartCard> getRegistry() {
		return registry;
	}

	public void setRegistry(List<SmartCard> registry) {
		this.registry = registry;
	}
	
	
}
