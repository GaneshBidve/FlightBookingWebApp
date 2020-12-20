package com.csi.fbs.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false)
	@NotBlank(message = "* First Name is required")
	private String firstname;

	@Column(name = "middlename", nullable = true)
	private String middlename;

	@Column(nullable = false)
	@NotBlank(message = "* Last Name is required")
	private String lastname;

	@Column(nullable = false, unique = true)
	@NotBlank(message = "* Username is required")
	private String username;

	@Column(nullable = false, unique = true)
	@NotBlank(message = "* Email is required")
	@Email(message = "{errors.invalid_email}")
	private String email;

	@Column(nullable = false)
	@NotBlank(message = "* Password is required")
	@Size(min = 8)
	private String password;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "users_roles", joinColumns = {
			@JoinColumn(name = "USER_ID", referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID") })
	private List<Role> roles;

}
