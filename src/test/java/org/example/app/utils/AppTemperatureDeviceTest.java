package org.example.app.utils;

import org.example.app.exceptions.TemperatureException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTemperatureDeviceTest {

    AppTemperatureDevice temperatureDevice;

    @BeforeEach
    void setUp() {
        temperatureDevice = new AppTemperatureDevice();
    }

    // Має бути відповідне повідомлення про валідну температуру.
    // Тестуємо чи вхідне значення температуры є в межах
    // можливостей пристрою.
    // При провалі тесту виведеться Invalid altitude.
    // Провал тесту забезпечуємо аргументом для temperatureDevice.validateTemperature(arg)
    // за межами встановленого діапазону температуры.
    @Test
    @DisplayName("Test if temperature is in bounds from -10 to 35 degrees.")
    void test_If_Temperature_Is_In_Bounds() throws TemperatureException {
        assertEquals("Temperature is in bounds from -10 to 35 degrees. ", temperatureDevice.validateTemperature(-10));
    }

    // Має бути виняткова ситуація.
    // Тестуємо чи буде виняткова ситуація,
    // якщо вхідне значення температуры не є в межах
    // можливостей пристрою.
    // При провалі тесту виведеться No exception.
    // Провал тесту забезпечуємо аргументом для temperatureDevice.validateTemperature(arg)
    // в межах встановленого діапазону температуры.
    @Test
    @DisplayName("Test if invalid temperature from -10 to 35 degrees throws exception.")
    void test_If_Invalid_Temperature_Throws_Exception() {
        assertThrows(TemperatureException.class, () -> temperatureDevice.validateTemperature(36), "No exception.");
    }

    @AfterEach
    void tearDown() {
        temperatureDevice = null;
    }
}