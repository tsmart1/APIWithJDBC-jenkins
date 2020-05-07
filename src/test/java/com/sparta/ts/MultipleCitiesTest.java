package com.sparta.ts;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MultipleCitiesTest {
    static City[] cities;

    @BeforeAll
    public static void init() {
        String[] args = {""};
        ApiWithJdbcApplication.main(args);
        JacksonAPIReader jacksonAPIReader = new JacksonAPIReader();
        String extension = "countrycode/NZL";
        cities = jacksonAPIReader.getCitiesFromApi(extension);
    }

    @Test
    void testThatFirstResultIsAuckland() {
        assertEquals("Auckland", cities[0].getName());
    }

    @Test
    void testThatPopulationOfThirdResultIs281800() {
        assertEquals(281800,cities[2].getPopulation());
    }

    @Test
    void testThatLastResultIsLowerHutt() {
        assertEquals("Lower Hutt", cities[cities.length-1].getName());
    }

    @Test
    void testThatAllResultsAreNZL() {
        boolean nzlCheck = false;
        for (City c:cities) {
            if (!c.getCountryCode().equals("NZL")) {
                nzlCheck = true;
                break;
            }
        }
        assertFalse(nzlCheck);
    }
}
