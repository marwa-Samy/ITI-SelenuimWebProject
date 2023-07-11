package com.Luma.project.testCases;

import com.Luma.project.utils.ConfigUtils;
import com.Luma.project.base.BaseTest;
import com.Luma.project.pages.LogInPage;
import com.Luma.project.pages.SearchPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("search Feature")
public class SearchTest extends BaseTest {

    @Test(priority = 3,description = "Test the search par functionality")
    public void ShouldBeAbleToUseTheSearchPar(){
        LogInPage logInPage=new LogInPage(driver);
        SearchPage searchPage=new SearchPage(driver);
        logInPage.load();
        logInPage.login(ConfigUtils.getInstance().getPassword(), ConfigUtils.getInstance().getEmail());
        searchPage.search(ConfigUtils.getInstance().getItem());
        boolean element= searchPage.resultMessageIsDisplayed();
       Assert.assertTrue(element);
    }
}