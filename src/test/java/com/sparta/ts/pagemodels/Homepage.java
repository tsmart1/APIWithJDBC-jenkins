package com.sparta.ts.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver webDriver;
    // Replace xpaths
    By idSearch = By.xpath("/html/body/ul/li[1]/h1/div/a");
    By firstNameSearch = By.xpath("/html/body/ul/li[2]/h1/div/a");
    By lastNameSearch = By.xpath("/html/body/ul/li[3]/h1/div/a");
    By emailSearch = By.xpath("/html/body/ul/li[4]/h1/div/a");
    By birthDateSearch = By.xpath("/html/body/ul/div/li/h1/a");

    public Homepage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Homepage navigateToHomepage() {
        webDriver.get("http://localhost:8080/");
        return this;
    }

    public Homepage clickIdLink(){
        webDriver.findElement(idSearch).click();
        return this;
    }

    public Homepage clickFirstNameLink() {
        webDriver.findElement(firstNameSearch).click();
        return this;
    }

    public Homepage clickLastNameLink() {
        webDriver.findElement(lastNameSearch).click();
        return this;
    }

    public Homepage clickEmailLink() {
        webDriver.findElement(emailSearch).click();
        return this;
    }

    public Homepage clickBirthDateLink() {
        webDriver.findElement(birthDateSearch).click();
        return this;
    }

}
