# APIWithJDBC-jenkins

## About this project

This is a Spring Application that runs an API consisting of an API of a randomly generated list of 'authors'. It utilises JDBC in order to link to the database and hosts it on the application. To test the application, Jackson is used in order to deserialised the JSON from the API into java objects which can then be tested on. A test runner has been created in order to easily run the mulitple test classes. It is intended as a proof-of-concept of linking these things together.

Additionally, Jenkins has been used in order to automatically generate builds when new pushes are made to the gitub repository.

## Requirements

This application runs on and requires:

* Java 11.
* MySQL Server 8.0 running on port 3306.

## Sample API Calls

When the server is running, the following API calls can be made:

* /api/author/id/{id} - Retrieve a single author by id
* /api/author/firstname/{firstname} - Retrieves authors by first name
* /api/city/lastname/{lastname} - Retrieve an array of authors by last name
* /api/city/email/{email} - Retrieve an array of authors by email
* /api/city/birthdate/{birthdate} - Retrieve an array of cities by birthdate

## Web Element

Additionally, a simple homepage has been created with links to sample searches in order to incorporate web testing into this project. The intention is to build on this.
