package com.csi.fbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csi.fbs.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
}
