package org.example.app.utils;

import org.example.app.exceptions.TemperatureException;

public class AppTemperatureDevice {

    private static final int TEMPERATURE_LOWER_LIMIT = -10;
    private static final int TEMPERATURE_UPPER_LIMIT = 35;

    public String validateTemperature(int temperature) throws TemperatureException {
        if (temperature >= TEMPERATURE_LOWER_LIMIT
                & temperature <= TEMPERATURE_UPPER_LIMIT) {
            return "Temperature is in bounds from -10 to 35 degrees. ";
        }
        else {
            throw new TemperatureException("Invalid temperature.");
        }
    }
}
