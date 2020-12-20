package com.csi.fbs.model;

import javax.persistence.*;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Aircraft {

	@Id
	@GeneratedValue
	private long aircraftId;

	private String manufacturer;

	private String model;

	private Integer numberOfSeats;

	@OneToMany(mappedBy = "aircraft")
	private List<Flight> flights = new ArrayList<>();

}