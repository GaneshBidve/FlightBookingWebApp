package com.csi.fbs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Airport {

	@Id
	@GeneratedValue
	private int airportId;

	private String airportCode;
	private String airportName;

	private String city;
	private String state;

	private String country;

	@OneToMany(mappedBy = "departureAirport")
	List<Flight> flights = new ArrayList<Flight>();

}