package edu.ucsd.cs110.temperature;

import edu.ucsd.cs110.tests.FahrenheitTest;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = ((this.getValue() - 32) * 5) / 9;
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}