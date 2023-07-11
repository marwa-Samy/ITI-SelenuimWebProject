package com.Luma.project.pages;

import com.Luma.project.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AASignUpPage extends BasePage {
    public AASignUpPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText="Create an Account")
    private   WebElement createAcountElement;
    @FindBy(id="firstname")
    private  WebElement firstNameElement;

    @FindBy(id="lastname")
    private   WebElement lastNameElement;

    @FindBy(id="email_address")
    private   WebElement emailAddressElement;

    @FindBy(id="password")
    private  WebElement passwordElement;

    @FindBy(id="password-confirmation")
    private  WebElement passwordConfirmationElement;

    @FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]")
    private   WebElement createAcountButton;

    @FindBy(xpath ="//*[@id=\"maincontent\"]/div[1]/div[2]/div" )
  private   WebElement welcomeMessage;
    @Step
    public boolean welcomeMessageIsDisplayed(){
        return welcomeMessage.isDisplayed();
    }
    @Step
    public void creatAcount(String firstName,String lastName,String email,String password,String confirmationPassword){
        createAcountElement.click();
        firstNameElement.sendKeys(firstName);
        lastNameElement.sendKeys(lastName);
        emailAddressElement.sendKeys(email);
        passwordElement.sendKeys(password);
        passwordConfirmationElement.sendKeys(confirmationPassword);
        createAcountButton.click();
    }

}
