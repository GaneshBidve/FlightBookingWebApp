package com.csi.fbs.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;

import com.csi.fbs.model.Airport;
import com.csi.fbs.model.Flight;

public interface FlightService {

	public Page<Flight> getAllFlightsPaged(int pageNum);

	public List<Flight> getAllFlights();

	public Flight getFlightById(long flightId);

	public Flight saveFlight(Flight flight);

	public void deleteFlightById(long flightId);

	public List<Flight> getAllFlightsByAirportAndDepartureTime(Airport depAirport, Airport destAirport,
			LocalDate depDate);
}
