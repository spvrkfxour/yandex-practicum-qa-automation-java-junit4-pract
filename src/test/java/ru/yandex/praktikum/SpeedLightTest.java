package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SpeedLightTest {
    private final String expectedLight;
    private final int speed;

    public SpeedLightTest(String expectedLight, int speed) {
        this.expectedLight = expectedLight;
        this.speed = speed;
    }

    @Parameterized.Parameters(name = "expectedLight = {0}, speed = {1}")
    public static Object[][] data() {
        return new Object[][] {
                {"green", 30},
                {"yellow", 70},
                {"red", 100},
        };
    }

    @Test
    public void checkLight() {
        SpeedLight speedLight = new SpeedLight();
        assertEquals(expectedLight, speedLight.showLight(speed));
    }
}