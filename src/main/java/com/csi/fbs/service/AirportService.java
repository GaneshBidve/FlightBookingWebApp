package com.csi.fbs.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.csi.fbs.model.Airport;

public interface AirportService {

	public Page<Airport> getAllAirportsPaged(int pageNum);

	public List<Airport> getAllAirports();

	public Airport getAirportById(Integer airportId);

	public Airport saveAirport(Airport airport);

	public void deleteAirport(Integer airpportId);
}
