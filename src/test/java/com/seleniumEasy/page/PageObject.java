package com.seleniumEasy.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageObject extends BaseUrl {
    WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }
    By SearchBox = By.id("edit-search-block-form--2");

    public void navigateTo() {
        driver.get(baseUrl);
    }
    public void baseTitle() {
        String GenTitle = driver.getTitle();
        Assert.assertTrue(GenTitle.equals("Learn Selenium with Best Practices and Examples | Selenium Easy"));
    }
    public void searchInputField() {
        driver.findElement(SearchBox).sendKeys("interview", Keys.ENTER);
    }
}