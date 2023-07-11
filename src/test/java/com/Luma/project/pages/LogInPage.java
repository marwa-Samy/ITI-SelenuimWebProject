package com.Luma.project.pages;

import com.Luma.project.utils.ConfigUtils;
import com.Luma.project.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Sign In")
    private WebElement signElement;

    @FindBy(id="email")
    private WebElement emailElement;

    @FindBy(id="pass")
    private WebElement passElement;

    @FindBy(id="send2")
    private WebElement signInButton;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[1]/span")
    WebElement welcomeMessage;

    @Step
public void load(){
      driver.get(ConfigUtils.getInstance().getBaseUrl());

}
    @Step
public boolean welcomeMessageIsDisplayed(){
    return welcomeMessage.isDisplayed();
}

    @Step
    public void login(String password,String email){
        signElement.click();
        emailElement.sendKeys(email);
        passElement.sendKeys(password);
        signInButton.click();
    }
}
