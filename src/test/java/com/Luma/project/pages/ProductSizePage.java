package com.Luma.project.pages;

import com.Luma.project.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSizePage extends BasePage {
    public ProductSizePage(WebDriver driver) {
        super(driver);
    }

@FindBy(id = "option-label-size-143-item-167")
  private   WebElement sizeElement;
    @FindBy(xpath = "//*[@id=\"product-options-wrapper\"]/div/div/div[1]/span[2]")
   private WebElement sizeTextElement;
    @Step
    public void productSize(){
        sizeElement.click();
    }
    @Step
    public String productText(){
       return sizeTextElement.getText();
    }
}
