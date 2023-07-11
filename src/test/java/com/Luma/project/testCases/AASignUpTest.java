package com.Luma.project.testCases;

import com.Luma.project.utils.ConfigUtils;
import com.Luma.project.base.BaseTest;
import com.Luma.project.pages.LogInPage;
import com.Luma.project.pages.AASignUpPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("user feature")

public class AASignUpTest extends BaseTest {

    @Test(priority = 1,description = "Test signup with valid email and password")
    public void ShouldBeAbleToSignUpWithEmailAndPassWord() {

        LogInPage logInPage=new LogInPage(driver);
        AASignUpPage signUpPage=new AASignUpPage(driver);
       logInPage.load();
    signUpPage.creatAcount(ConfigUtils.getInstance().getFirstName(),
            ConfigUtils.getInstance().getLastName(),
            ConfigUtils.getInstance().getEmail(), ConfigUtils.getInstance().getPassword(),
            ConfigUtils.getInstance().getPassword());
      boolean registered= signUpPage.welcomeMessageIsDisplayed();
      Assert.assertTrue(registered);

    }
}
