package com.converter;

import java.util.Scanner;

public class Main {
  
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		while(choice == 0) {
		System.out.print("1 - Fahrenheit To Celsius \n2 - Celsius To Fahrenheit \n3 - Celsius To Kelvin \n4 - Kelvin To Celsius \n5 - Fahrenheit To Kelvin \n6 - Kelvin To Celsius  \n7 - Quit \n");
		System.out.println("Choice : ");
	    choice = input.nextInt();
		switch(choice) {
		   case  1 :
			System.out.println("Enter you're value : ");
			double fahrenheittocels = input.nextDouble();
			FahrenheitToCelsius fahrenheittoCelsius = new FahrenheitToCelsius(fahrenheittocels);	
			System.out.println(fahrenheittoCelsius.convert() + " C°");
			choice = 0;
		    break;
			case 2 : 
			System.out.println("Enter you're value : ");
			double celsiustofahren = input.nextDouble();
			CelsiusToFahrenheit celsiustoFahrenheit = new CelsiusToFahrenheit(celsiustofahren);
			System.out.println(celsiustoFahrenheit.convert() + " F");	
			choice = 0;
			break;
			case 3:
				System.out.println("Enter you're value : ");
				double celsiustokev = input.nextDouble();
				CelsiusToKelvin celsiustoKelvin = new CelsiusToKelvin(celsiustokev);
				System.out.println(celsiustoKelvin.convert() + " K");
				choice = 0;
			case 4:
				System.out.println("Enter you're value : ");
				double kelvintocels = input.nextDouble();
				KelvinToCelsius kelvintocelsius = new KelvinToCelsius(kelvintocels);	
				System.out.println(kelvintocelsius.convert() + " C°");
				choice = 0;
			case 5:
				System.out.println("Enter you're value : ");
				double fahrenheittokev = input.nextDouble();
				FahrenheitToKelvin fahrenheittokelvin= new FahrenheitToKelvin(fahrenheittokev);	
				System.out.println(fahrenheittokelvin.convert() + " K");
				choice = 0;
			case 6:
				System.out.println("Enter you're value : ");
				double kelvintofahren = input.nextDouble();
				KelvinToFahrenheit kelvintofahrenheit = new KelvinToFahrenheit(kelvintofahren);	
				System.out.println(kelvintofahrenheit.convert() + " F");
				choice = 0;
			case 7:
				System.out.println("Exiting programme....");
				input.close();
				System.exit(0);
		
		default:
			System.out.println("Unvalid Choice");
			break;
		}
		}
		}
	

}
