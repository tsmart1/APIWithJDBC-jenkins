package com.sparta.ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class WorldDAO {

    static Connection connection = null;

    public static void connectToDb() {
        try {
            String url = "jdbc:mysql://localhost:3306?serverTimezone=UTC";
            String user = "root";
            String password = "1234";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Author> runQuery(String query) {

        Statement statement = null;
        ResultSet results = null;
        ArrayList<Author> authors = new ArrayList<>();

        try {
            statement = connection.createStatement();
            statement.executeQuery("use world");
            results = statement.executeQuery(query);
            while (results.next()) {
                authors.add(new Author(results.getInt(1),
                        results.getString(2), results.getString(3),
                        results.getString(4), results.getString(5)));
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return authors;
    }

}