package com.broadway.corejavaassignment.TemperatureConversion;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        float cel = getCelsiusTemperature();
        System.out.println("Temperature in Fahrenheit : " +convertCelsiusToFahrenheit(cel) + " F");
        float fah = getFahrenheitTemperature();
        System.out.println("Temperature in Celsius : " +convertFahrenheitIntoCelsius(fah)+ " C");
    }
    // read temperture in Celsius
    public static float getCelsiusTemperature(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius : ");
        return sn.nextInt();
    }
    // read temperature in fahrenheit
    public static float getFahrenheitTemperature(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit : ");
        return sn.nextInt();
    }
    public static float convertCelsiusToFahrenheit(float c){
        float fahrenheit = (float) ((9.0 * c) / 5.0 + 32.0);
        return fahrenheit;
    }

    public static float convertFahrenheitIntoCelsius(float f){
        float celsius = (float) ((f - 32.0) * 5.0/9.0);
        return celsius;
    }
}
