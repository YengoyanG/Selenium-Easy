package com.seleniumEasy.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUrl {
    public ChromeDriver driver;
    String baseUrl = "https://www.seleniumeasy.com";

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @After
    public void close(){
        driver.quit();
    }
}