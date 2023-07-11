package com.Luma.project.testCases;

import com.Luma.project.utils.ConfigUtils;
import com.Luma.project.base.BaseTest;
import com.Luma.project.pages.*;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Feature("product feature")
public class ProductQuantityTest extends BaseTest {
    @Test(priority = 5,description = "Test the quantity field of product")
    public void ShouldBeAbleToChooseItemQuantity() throws InterruptedException {

        LogInPage logInPage = new LogInPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductColorPage productColorPage=new ProductColorPage(driver);
        ProductSizePage productSizePage =new ProductSizePage(driver);
        ProductQuantityPage productQuantityPage=new ProductQuantityPage(driver);
        logInPage.load();
        logInPage.login(ConfigUtils.getInstance().getPassword(), ConfigUtils.getInstance().getEmail());
        searchPage.search(ConfigUtils.getInstance().getItem());
        productColorPage.productColorMethod();
        productSizePage.productSize();
        productQuantityPage.quantity(ConfigUtils.getInstance().getNumberOfItemes());
String text=driver.findElement(By.id("qty")).getText();
        System.out.println(text);

    }
}