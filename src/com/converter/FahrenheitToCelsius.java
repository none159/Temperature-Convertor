package com.converter;

public class FahrenheitToCelsius {
	 //(f-32)*5/9
	double Fahrenheit;

	public FahrenheitToCelsius(double fahrenheit) {
		super();
		this.Fahrenheit = fahrenheit;
	}
	public double convert() {
	 	double Celsius = (this.Fahrenheit-32)*5/9;
	    return Celsius;
	}
		
	
}
