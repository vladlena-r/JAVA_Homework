package Homework21_03_2023;

public class Converter {
    public double convertFahrenheit(double tempCelsius) {
        double Fahrenheit = tempCelsius * 1.8 + 32;
        return Fahrenheit;
    }

    public double convertKelvin(double tempCelsius) {
        double Kelvin = tempCelsius + 273.15;
        return Kelvin;
    }
}

