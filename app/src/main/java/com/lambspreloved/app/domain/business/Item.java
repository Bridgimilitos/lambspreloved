package com.lambspreloved.app.domain.business;

import java.awt.Color;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;

@Getter
public class Item 
{
	private UUID id;
	private String description;
	private BigDecimal cost;
	private LocalDate dateBought;
	private String sourcedFrom;
	private BigDecimal price;
	private LocalDateTime dateSold;
	private byte[] image;
	private Color colour;
	private Size size;
	private ClothingType type;
	private String brand;
	private BigDecimal weight;
	
	public Item(String description, BigDecimal cost, String sourcedFrom) 
	{
		this.description = description;
		this.cost = cost;
		this.dateBought = LocalDate.now();
		this.sourcedFrom = sourcedFrom;
	}

	public addItem()
}
