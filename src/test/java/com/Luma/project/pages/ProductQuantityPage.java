package com.Luma.project.pages;

import com.Luma.project.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductQuantityPage extends BasePage {
    public ProductQuantityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="qty")
  private   WebElement quantityElement;

    @Step
   public void quantity(String itemNom){
       quantityElement.clear();
       quantityElement.sendKeys(itemNom);
   }

}
