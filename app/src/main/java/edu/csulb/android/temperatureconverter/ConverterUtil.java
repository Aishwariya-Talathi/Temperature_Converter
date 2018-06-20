package edu.csulb.android.temperatureconverter;

/**
 * Created by aishwariyatalathi on 2/15/17.
 */

public class ConverterUtil {
    //converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit)
    {
        return ((fahrenheit - 32) * 5 / 9);
    }
    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius)
    {
        return ((celsius * 9) / 5) + 32;
    }
}
