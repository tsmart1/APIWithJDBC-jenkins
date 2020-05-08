package com.sparta.ts;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleCityTest {
    static City[] cities;

    @BeforeAll
    public static void init() {
        String extension = "id/89";
        cities = JacksonAPIReader.getCitiesFromApi(extension);
    }

    @Test
    void testThatIdIs89() {
        assertEquals(89, cities[0].getId());
    }

    @Test
    void testThatNameIsSanIsidro() {
        assertEquals("San Isidro", cities[0].getName());
    }

    @Test
    void testThatCountryCodeIsArg() {
        assertEquals("ARG", cities[0].getCountryCode());
    }

    @Test
    void testThatDistrictIsBuenosAires() {
        assertEquals("Buenos Aires", cities[0].getDistrict());
    }

    @Test
    void testThatPopulationIs306341() {
        assertEquals(306341, cities[0].getPopulation());
    }
}
