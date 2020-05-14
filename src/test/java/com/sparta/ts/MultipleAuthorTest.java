package com.sparta.ts;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MultipleAuthorTest {
    static Author[] authors;

    @BeforeAll
    public static void init() {
        String extension = "lastname/white";
        authors = JacksonAPIReader.getAuthorsFromApi(extension);
    }

    @Test
    void testThatFirstResultIsId143() {
        assertEquals(143, authors[0].getId());
    }

    @Test
    void testThatSecondResultIsId170() {
        assertEquals(170, authors[1].getId());
    }

    @Test
    void testFirstResultEmail() {
        assertEquals("rking@example.net", authors[0].getEmail());
    }

    @Test
    void testSecondResultEmail() {
        assertEquals("ebartoletti@example.net", authors[1].getEmail());
    }

    @Test
    void testThatAllResultsAreNZL() {
        boolean whiteCheck = false;
        for (Author c: authors) {
            if (!c.getLast_name().equals("White")) {
                whiteCheck = true;
                break;
            }
        }
        assertFalse(whiteCheck);
    }
}
