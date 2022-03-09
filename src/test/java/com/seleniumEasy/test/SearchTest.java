package com.seleniumEasy.test;

import com.seleniumEasy.page.BaseUrl;
import com.seleniumEasy.page.PageObject;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class SearchTest extends BaseUrl {

    @Test
    public void firstTest() {
        PageObject webSite = PageFactory.initElements(driver, PageObject.class);
        webSite.navigateTo();
        webSite.baseTitle();
        webSite.searchInputField();
        SearchResults SearchResultsPage = PageFactory.initElements(driver, SearchResults.class);
        SearchResultsPage.SearchTitle();

    }
}