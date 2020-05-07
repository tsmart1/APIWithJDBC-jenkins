package com.sparta.ts;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;

public class JacksonAPIReader {
    private ObjectMapper objectMapper = new ObjectMapper();

    public City[] getCitiesFromApi(String extension) { // id/1
        City[] cities = null;
        try {
            cities = objectMapper.readValue(new URL("http://localhost:8080/api/city/" + extension), City[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cities;
    }
}