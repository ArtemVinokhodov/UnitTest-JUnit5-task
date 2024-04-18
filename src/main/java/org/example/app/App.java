package org.example.app;

import org.example.app.data.DataProvider;
import org.example.app.exceptions.TemperatureException;
import org.example.app.utils.AppTemperatureDevice;

public class App {

    public static void main(String[] args) {
        getOutput(handleData());
    }

    private static String handleData() {
        DataProvider provider = new DataProvider();
        AppTemperatureDevice temperatureDevice = new AppTemperatureDevice();
        try {
            return temperatureDevice.validateTemperature(provider.getTemperature());
        } catch (TemperatureException ex) {
           return ex.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
