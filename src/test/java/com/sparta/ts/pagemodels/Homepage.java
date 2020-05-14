package com.sparta.ts.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver webDriver;
    By idSearch = By.xpath("/html/body/ul/li[1]/h1/div/a");

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
}
