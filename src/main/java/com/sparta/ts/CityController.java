package com.sparta.ts;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @GetMapping("/api/city/id/{id}")
    public ArrayList<City> getCitiesById(@PathVariable int id) throws SQLException {
        return WorldDAO.runQuery("select * from city where id=" + id);
    }

    @GetMapping("/api/city/name/{name}")
    public ArrayList<City> getCitiesByName(@PathVariable String name) throws SQLException {
        return WorldDAO.runQuery("select * from city where name=\"" + name + "\"");
    }

    @GetMapping("/api/city/countrycode/{countryCode}")
    public ArrayList<City> getCitiesByCountryCode(@PathVariable String countryCode) throws SQLException {
        return WorldDAO.runQuery("select * from city where CountryCode=\"" + countryCode + "\"");
    }

    @GetMapping("/api/city/district/{district}")
    public ArrayList<City> getCitiesByDistrict(@PathVariable String district) throws SQLException {
        return WorldDAO.runQuery("select * from city where district=\"" + district + "\"");
    }

    @GetMapping("/api/city/population/{population}")
    public ArrayList<City> getCitiesByPopulation(@PathVariable int population) throws SQLException {
        return WorldDAO.runQuery("select * from city where population=" + population);
    }
}
