package com.converter;

public class KelvinToFahrenheit {
    double Kelvin;
	public KelvinToFahrenheit(double Kelvin) {
		super();
		this.Kelvin = Kelvin;
	}

	public double convert() {
		 /* double Fahrenheit = (Kelvin-273.15)*(9/5) + 32;
		  return Fahrenheit;*/
		  return (Kelvin-273.15)*(9/5) + 32;
	}

}
