package com.converter;

public class KelvinToCelsius {
  double Kelvin;

public KelvinToCelsius(double kelvin) {
	super();
	Kelvin = kelvin;
}
   public double convert() {
	   /*double Celsius = Kelvin - 273.15;
	   return Celsius;*/
	   return Kelvin - 273.15;
   }
}
