package com.converter;

public class FahrenheitToKelvin {
    double Fahrenheit;
	public FahrenheitToKelvin(double Fahrenheit) {
		super();
		this.Fahrenheit = Fahrenheit;
	}

	public double convert() {
		/*double Kelvin = (Fahrenheit-32)*(5/9) + 273.15;
		return Kelvin;*/
		return (Fahrenheit-32)*(5/9) + 273.15;
	}

}
