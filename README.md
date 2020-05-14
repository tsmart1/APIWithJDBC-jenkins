# APIWithJDBC-jenkins

## About this project

This is a Spring Application that runs an API consisting of an API of cities of the world, using data from a sample MySQL database. It utilises JDBC in order to link to the database and hosts it on the application. To test the application, Jackson is used in order to deserialised the JSON from the API into java objects which can then be tested on. A test runner has been created in order to easily run the mulitple test classes. It is intended as a proof-of-concept of linking these things together.

Additionally, Jenkins has been used in order to automatically generate builds when new pushes are made to the gitub repository.

## Requirements

This application runs on and requires:

* Java 11.
* MySQL Server 8.0 running on port 3306.
* Additionally requires the MySQL 8 Samples and Examples option in the MySQLInstaller, and for the world database to be running on the server.

## Sample API Calls

When the server is running, the following API calls can be made:

* /api/city/id/{id} - Retrieve a single city by id
* /api/city/name/{name} - Retrieve a single city by name
* /api/city/countrycode/{countryCode} - Retrieve an array of cities by countrycode
* /api/city/district/{district} - Retrieve an array of cities by district
* /api/city/population/{population} - Retrieve an array of cities by district
