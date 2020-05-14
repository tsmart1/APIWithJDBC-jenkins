package com.sparta.ts;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @GetMapping("/api/author/id/{id}")
    public static ArrayList<Author> getAuthorById(@PathVariable int id) {
        return WorldDAO.runQuery("select * from authors where id=" + id);
    }

    @GetMapping("/api/author/firstname/{name}")
    public ArrayList<Author> getAuthorByFirstName(@PathVariable String name) {
        return WorldDAO.runQuery("select * from authors where first_name=\"" + name + "\"");
    }

    @GetMapping("/api/author/lastname/{name}")
    public ArrayList<Author> getAuthorByLastName(@PathVariable String name) {
        return WorldDAO.runQuery("select * from authors where last_name=\"" + name + "\"");
    }

    @GetMapping("/api/author/email/{email}")
    public ArrayList<Author> getAuthorByEmail(@PathVariable String email) {
        return WorldDAO.runQuery("select * from authors where email=\"" + email + "\"");
    }

    @GetMapping("/api/author/birthdate/{birthDate}")
    public ArrayList<Author> getAuthorByBirthDate(@PathVariable String birthDate) {
        return WorldDAO.runQuery("select * from authors where birthdate=\"" + birthDate + "\"");
    }
}
