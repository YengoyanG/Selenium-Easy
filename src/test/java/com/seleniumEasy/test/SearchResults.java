package com.seleniumEasy.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class SearchResults {
    WebDriver driver;

    public SearchResults(WebDriver driver) {
        this.driver = driver;
    }
    By SearchResult = By.cssSelector("h3.title");

    public void SearchTitle() {
        List<WebElement> title = new ArrayList<>(driver.findElements(SearchResult));
        String results;

        for (WebElement value : title) {
            System.out.println(value.getText());
            results = value.getText();
            Assert.assertTrue(results.contains("interview"));
        }
    }
}
