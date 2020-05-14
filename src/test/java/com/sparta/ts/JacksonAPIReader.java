package com.sparta.ts;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;

public class JacksonAPIReader {
    static boolean serverRunning = false;

    public static Author[] getAuthorsFromApi(String extension) { // id/1
        ObjectMapper objectMapper = new ObjectMapper();
        Author[] authors = null;
        try {
            if (!serverRunning) {
                run();
                serverRunning = true;
            }
            authors = objectMapper.readValue(new URL("http://localhost:8080/api/author/" + extension), Author[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return authors;
    }

    private static void run(){
        ApiWithJdbcApplication.main(new String[]{""});
    }
}