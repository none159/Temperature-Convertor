package com.converter;

public class CelsiusToFahrenheit {
//((9*c)/5)+32
	double Celsius;

public CelsiusToFahrenheit(double celsius) {
	super();
	this.Celsius = celsius;
}
public double convert() {
 	/*double Fahrenheit = ((9*this.Celsius)/5)+32;
    return Fahrenheit;*/
	return ((9*this.Celsius)/5)+32;
}
	
}
