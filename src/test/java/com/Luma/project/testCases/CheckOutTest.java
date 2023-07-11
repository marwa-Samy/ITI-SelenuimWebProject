package com.Luma.project.testCases;

import com.Luma.project.utils.ConfigUtils;
import com.Luma.project.base.BaseTest;
import com.Luma.project.pages.*;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
@Feature("checkout feature")
public class CheckOutTest extends BaseTest {
    @Test(priority = 8,description = "Test the checkout availability")
    public void ShouldBeAbleToCheckOut() throws InterruptedException {

        LogInPage logInPage = new LogInPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductColorPage productColorPage=new ProductColorPage(driver);
        ProductSizePage productSizePage =new ProductSizePage(driver);
        ProductQuantityPage productQuantityPage=new ProductQuantityPage(driver);
        AddCartPage addCartPage=new AddCartPage(driver);
        CheckOutPage checkOutPage=new CheckOutPage(driver);
        logInPage.load();
        logInPage.login(ConfigUtils.getInstance().getPassword(), ConfigUtils.getInstance().getEmail());
        searchPage.search(ConfigUtils.getInstance().getItem());
        productColorPage.productColorMethod();
        productSizePage.productSize();
        productQuantityPage.quantity(ConfigUtils.getInstance().getNumberOfItemes());
        Thread.sleep(Duration.ofSeconds(5));
        addCartPage.cart();
        Thread.sleep(Duration.ofSeconds(3));
        checkOutPage.CheckOutButton();
        if(checkOutPage.companyIsDisplayed()==true){
            checkOutPage.checkOutMethod(ConfigUtils.getInstance().getCompany(), ConfigUtils.getInstance().getstreet0(), ConfigUtils.getInstance().getstreet1(),
                    ConfigUtils.getInstance().getstreet2(), ConfigUtils.getInstance().getcity(),
                    ConfigUtils.getInstance().getpostalCode(), ConfigUtils.getInstance().getphone());
            checkOutPage.stateDropDown();
            checkOutPage.countyDropDown();
            checkOutPage.nextMethod();
        }else {
            Thread.sleep(Duration.ofSeconds(3));
            checkOutPage.nextMethod();
        }
       boolean paymentPage=checkOutPage.paymentMethodIsDisplayed();
        Assert.assertTrue(paymentPage);

    }
}
