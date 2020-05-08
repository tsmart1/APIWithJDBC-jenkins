package com.sparta.ts;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;

public class JacksonAPIReader {
    static boolean serverRunning = false;

    public static City[] getCitiesFromApi(String extension) { // id/1
        ObjectMapper objectMapper = new ObjectMapper();
        City[] cities = null;
        try {
            if (!serverRunning) {
                run();
                serverRunning = true;
            }
            cities = objectMapper.readValue(new URL("http://localhost:8080/api/city/" + extension), City[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cities;
    }

    private static void run(){
        ApiWithJdbcApplication.main(new String[]{""});
    }
}