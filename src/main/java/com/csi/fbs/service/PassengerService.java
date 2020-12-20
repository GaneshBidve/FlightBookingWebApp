package com.csi.fbs.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.csi.fbs.model.Passenger;

public interface PassengerService {

	public Page<Passenger> getAllPassengersPaged(int pageNum);

	public List<Passenger> getAllPassengers();

	public Passenger getPassengerById(Long passengerId);

	public Passenger savePassenger(Passenger passenger);

	public void deletePassengerById(Long passengerId);
}
