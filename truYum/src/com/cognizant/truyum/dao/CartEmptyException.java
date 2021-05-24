package com.cognizant.truyum.dao;

@SuppressWarnings("serial")
public class CartEmptyException extends Throwable{

	CartEmptyException(String message){
		super(message);
	}
}
