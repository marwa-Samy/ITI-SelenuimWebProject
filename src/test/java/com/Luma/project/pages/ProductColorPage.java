package com.Luma.project.pages;

import com.Luma.project.base.BasePage;
import com.Luma.project.base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductColorPage extends BasePage {
    public ProductColorPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div")
  private   WebElement itemElement;
    @FindBy(id = "option-label-color-93-item-57")
   private WebElement colorElement;

    @FindBy(xpath= "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/img")
   private WebElement coloredItemElement;


    @Step
    public void productColorMethod(){
        itemElement.click();
        colorElement.click();
    }
    @Step
    public boolean productColorIsDisplayed(){
        return coloredItemElement.isDisplayed();
    }


}
