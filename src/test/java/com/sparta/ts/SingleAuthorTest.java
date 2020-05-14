package com.sparta.ts;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleAuthorTest {
    static Author[] authors;

    @BeforeAll
    public static void init() {
        String extension = "id/101";
        authors = JacksonAPIReader.getAuthorsFromApi(extension);
    }

    @Test
    void testThatIdIs101() {
        assertEquals(101, authors[0].getId());
    }

    @Test
    void testThatFirstNameIsGlennie() {
        assertEquals("Glennie", authors[0].getFirst_name());
    }

    @Test
    void testThatLastNameIsRobel() {
        assertEquals("Robel", authors[0].getLast_name());
    }

    @Test
    void testThatEmailIsCorrect() {
        assertEquals("adenesik@example.com", authors[0].getEmail());
    }

    @Test
    void testThatBirthDateIsCorrect() {
        assertEquals("1996-10-19", authors[0].getBirthdate());
    }
}
