package com.sathya.rest.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@JsonIgnore
	private int isbn;
	@JsonProperty("BookName")
	private String name;
	private String author;
	private double price;
	
}
