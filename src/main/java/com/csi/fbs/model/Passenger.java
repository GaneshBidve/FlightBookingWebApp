package com.csi.fbs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Passenger {

	@Id
	@GeneratedValue
	private long passengerId;

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

	@NotBlank
	private String phoneNumber;

	@NotBlank
	private String passportNumber;

	private String email;

	private String address;

	@ManyToOne
	private Flight flight;

}