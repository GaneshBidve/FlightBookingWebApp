package com.csi.fbs.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csi.fbs.model.Airport;
import com.csi.fbs.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	List<Flight> findAllByDepartureAirportEqualsAndDestinationAirportEqualsAndDepartureDateEquals(Airport depAirport,
			Airport destAirport, LocalDate depDate);

}
