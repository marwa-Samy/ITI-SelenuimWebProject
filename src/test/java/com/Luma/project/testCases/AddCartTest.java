package com.Luma.project.testCases;

import com.Luma.project.utils.ConfigUtils;
import com.Luma.project.base.BaseTest;
import com.Luma.project.pages.*;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("cart feature")
public class AddCartTest extends BaseTest {
    @Test(priority = 7,description = "Test availability to add item in the cart correctly")
   public void ShouldBeAbleToAddToCart() throws InterruptedException {

       //String expected="Adrienne Trek Jacket";
       LogInPage logInPage = new LogInPage(driver);
       SearchPage searchPage = new SearchPage(driver);
       ProductColorPage productColorPage=new ProductColorPage(driver);
       ProductSizePage productSizePage =new ProductSizePage(driver);
       ProductQuantityPage productQuantityPage=new ProductQuantityPage(driver);
       AddCartPage addCartPage=new AddCartPage(driver);
       logInPage.load();
       logInPage.login(ConfigUtils.getInstance().getPassword(), ConfigUtils.getInstance().getEmail());
       searchPage.search(ConfigUtils.getInstance().getItem());
       productColorPage.productColorMethod();
       productSizePage.productSize();
       productQuantityPage.quantity(ConfigUtils.getInstance().getNumberOfItemes());
       addCartPage.cart();
    // String actual= addCartPage.itemIsDisplayed();
       // Assert.assertEquals(actual,expected);
        Assert.assertTrue(addCartPage.addCartMessageSuccessfully());

   }
}
