package com.Luma.project.testCases;

import com.Luma.project.utils.ConfigUtils;
import com.Luma.project.base.BaseTest;
import com.Luma.project.pages.LogInPage;
import com.Luma.project.pages.ProductColorPage;
import com.Luma.project.pages.ProductSizePage;
import com.Luma.project.pages.SearchPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("product feature")
public class ProductSizeTest extends BaseTest {
    @Test(priority = 6,description = "Test the size field of product")
    public void ShouldBeAbleToChooseItemSize() throws InterruptedException {

        LogInPage logInPage = new LogInPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductColorPage productColorPage=new ProductColorPage(driver);
        ProductSizePage productSizePage =new ProductSizePage(driver);
        logInPage.load();
        logInPage.login(ConfigUtils.getInstance().getPassword(), ConfigUtils.getInstance().getEmail());
        searchPage.search(ConfigUtils.getInstance().getItem());
        productColorPage.productColorMethod();
        productSizePage.productSize();

String expected="S";
       String actualResult= productSizePage.productText();
        Assert.assertEquals(actualResult,expected);
    }
}