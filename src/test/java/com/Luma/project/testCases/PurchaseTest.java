package com.Luma.project.testCases;

import com.Luma.project.utils.ConfigUtils;
import com.Luma.project.base.BaseTest;
import com.Luma.project.pages.*;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
@Feature("purchase feature")
public class PurchaseTest extends BaseTest {
    @Test(priority = 9,description = "Test purchase availability")
    public void ShouldBeAbleToPurchase() throws InterruptedException {

        LogInPage logInPage = new LogInPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductColorPage productColorPage=new ProductColorPage(driver);
        ProductSizePage productSizePage =new ProductSizePage(driver);
        ProductQuantityPage productQuantityPage=new ProductQuantityPage(driver);
        AddCartPage addCartPage=new AddCartPage(driver);
        CheckOutPage checkOutPage=new CheckOutPage(driver);
        PurchasePage purchasePage=new PurchasePage(driver);
        logInPage.load();
        logInPage.login(ConfigUtils.getInstance().getPassword(),ConfigUtils.getInstance().getEmail());
        searchPage.search(ConfigUtils.getInstance().getItem());
        productColorPage.productColorMethod();
        productSizePage.productSize();
        productQuantityPage.quantity(ConfigUtils.getInstance().getNumberOfItemes());
        Thread.sleep(Duration.ofSeconds(5));
        addCartPage.cart();
        Thread.sleep(Duration.ofSeconds(5));
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
        Thread.sleep(Duration.ofSeconds(6));
       purchasePage.purchaseMethod();

        boolean purchaseSuccessMessage=purchasePage.purchaseMessageIsDisplayed();
        Assert.assertTrue(purchaseSuccessMessage);
    }
}
