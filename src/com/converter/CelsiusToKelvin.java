package com.converter;

public class CelsiusToKelvin {
     double Celsius;

	public CelsiusToKelvin(double celsius) {
		super();
		Celsius = celsius;
	}
    public double convert() {
    	/*double Kelvin = Celsius + 273.15;
    	return Kelvin;*/
    	return Celsius + 273.15;
    }
}
