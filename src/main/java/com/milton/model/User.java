package com.milton.model;

import java.math.BigInteger;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private BigInteger userId;

	@NotBlank(message ="Username is required")
	private String userName;
	
	@NotBlank(message = "password is requireds")
	private String password;
	
	@Email
	@NotEmpty(message = "Email is required")
	private String email;
	
	private Instant created;
	
	private boolean enabled;
}
