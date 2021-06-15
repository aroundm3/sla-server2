package com.g18.sla.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	private String firstName;
	private String lastName;

	private Date dateOfBirth;
	private Boolean gender;
	private String schoolName;
	private String job;
	private String phone;

	@Email
	@NotEmpty(message = "Email is required")
	private String email;

	private String address;

	@OneToOne(mappedBy = "user")
	private Account account;


	
	
	
}