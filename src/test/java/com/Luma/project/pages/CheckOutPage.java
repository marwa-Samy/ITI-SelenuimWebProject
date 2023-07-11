package com.Luma.project.pages;

import com.Luma.project.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends BasePage {

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id="top-cart-btn-checkout")
  private   WebElement checkOutButton;

@FindBy(name="company")
private  WebElement companyElement;

@FindBy(name = "street[0]")
private  WebElement addressElement0;
@FindBy(name = "street[1]")
private  WebElement addressElement1;

@FindBy(name = "street[2]")
private  WebElement addressElement2;
@FindBy(name="city")
private   WebElement cityElement;
@FindBy(name = "region_id")
private  WebElement stateElement;
@FindBy(name="postcode")
private   WebElement postcodeElement;

@FindBy(name = "country_id")
private    WebElement countryDropDownElement;
@FindBy(name="telephone")
private   WebElement telephoneElement;
@FindBy(name ="ko_unique_2")
private WebElement shippingRadioElement;

@FindBy(className="continue")
private   WebElement nextButton;
@FindBy(xpath = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[1]")
private  WebElement paymentPage;
    @Step
public void CheckOutButton(){
    checkOutButton.click();
}
    @Step
public void checkOutMethod(String company,String street0,String street1,String street2,String city,String postalCode,String phone)  {

   companyElement.sendKeys(company);
    addressElement0.sendKeys(street0);
    addressElement1.sendKeys(street1);
    addressElement2.sendKeys(street2);
    cityElement.sendKeys(city);
    telephoneElement.sendKeys(phone);
    postcodeElement.sendKeys(postalCode);
    shippingRadioElement.click();


}
    @Step
public void stateDropDown(){
    Select drpState = new Select(stateElement);
    drpState.selectByVisibleText("Alaska");

}
    @Step
public void countyDropDown(){
    Select drpCountry =new Select(countryDropDownElement);
            drpCountry.selectByIndex(1);
}
    @Step
public boolean paymentMethodIsDisplayed(){

    return paymentPage.isDisplayed();
}
    @Step
public void nextMethod(){

    nextButton.click();
}
    @Step
public boolean companyIsDisplayed(){
    return companyElement.isDisplayed();
}

}

