/**
 *
 * Copyright (c) 2020, CREDIT SYSTEM INDIA and/or its affiliates. All rights reserved.
 * CSI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.csi.fbs.serviceImpl;

import java.util.List;

import org.springframework.data.domain.Page;

import com.csi.fbs.model.Passenger;
import com.csi.fbs.service.PassengerService;

/**
 * @author Ganesh Bidve
 *
 */
public class PassengerServiceImpl implements PassengerService {

	@Override
	public Page<Passenger> getAllPassengersPaged(int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> getAllPassengers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger getPassengerById(Long passengerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger savePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePassengerById(Long passengerId) {
		// TODO Auto-generated method stub

	}

}
