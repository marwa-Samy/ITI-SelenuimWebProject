package com.Luma.project.testCases;

import com.Luma.project.utils.ConfigUtils;
import com.Luma.project.base.BaseTest;
import com.Luma.project.pages.LogInPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("user feature")
public class LoginTest extends BaseTest {

    @Test(priority = 2,description = "Test login functionality with email and password")
    public void ShouldBeAbleToLoginWithEmailAndPassWord(){
        LogInPage logInPage=new LogInPage(driver);
        logInPage.load();
         logInPage.login(ConfigUtils.getInstance().getPassword(), ConfigUtils.getInstance().getEmail());

   boolean loged=logInPage.welcomeMessageIsDisplayed();
       Assert.assertTrue(loged);

    }
}
