package com.lambspreloved.app.domain.business;

import java.util.UUID;

import lombok.Getter;

@Getter
public class Customer 
{
	private UUID id;
	private String firstName;
	private String surname;
	private String emailAddress;
	private String username;
}
