package com.Luma.project.pages;

import com.Luma.project.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchasePage extends BasePage {
    public PurchasePage(WebDriver driver) {
        super(driver);
    }
@FindBy(className = "checkout")
 private   WebElement orderButton;

    @FindBy(className = "page-title")
  private   WebElement purchaseMessageElement;
    @Step
    public void purchaseMethod(){
        orderButton.click();
    }

    @Step
    public boolean purchaseMessageIsDisplayed(){
        return purchaseMessageElement.isDisplayed();
    }
}
