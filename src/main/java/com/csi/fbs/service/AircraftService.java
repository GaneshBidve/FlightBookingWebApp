package com.csi.fbs.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.csi.fbs.model.Aircraft;

public interface AircraftService {

	public Page<Aircraft> getAllAircraftsPaged(int pageNum);

	public List<Aircraft> getAllAircrafts();

	public Aircraft getAircraftById(Long aircraftId);

	public Aircraft saveAircraft(Aircraft aircraft);

	public void deleteAircraftById(Long aircraftId);
}
