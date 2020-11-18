package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = this.getValue();
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        float value = ((this.getValue()*9) / 5) + 32;
        return new Fahrenheit(value);
    }

    public String toString()
    {
        return Float.toString(this.getValue()) + " C";
    }
}