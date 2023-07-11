package com.Luma.project.testCases;

import com.Luma.project.utils.ConfigUtils;
import com.Luma.project.base.BaseTest;
import com.Luma.project.pages.LogInPage;
import com.Luma.project.pages.ProductColorPage;
import com.Luma.project.pages.SearchPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("product feature")
public class ProductColorTest extends BaseTest {

        @Test(priority = 4,description = "Test the color field of the product")
        public void ShouldBeAbleToChooseItemColor() throws InterruptedException {

            LogInPage logInPage=new LogInPage(driver);
            SearchPage searchPage=new SearchPage(driver);
            ProductColorPage productColorPage=new ProductColorPage(driver);
            logInPage.load();
           logInPage .login(ConfigUtils.getInstance().getPassword(), ConfigUtils.getInstance().getEmail());
            searchPage.search(ConfigUtils.getInstance().getItem());
            productColorPage.productColorMethod();
boolean coloredItem=productColorPage.productColorIsDisplayed();
            Assert.assertTrue(coloredItem);
        }
    }
