package com.Luma.project.pages;

import com.Luma.project.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCartPage extends BasePage {
    public AddCartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="product-addtocart-button")
   private WebElement addCartButton;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div[1]/a")
    private  WebElement cartElement;

    @FindBy(linkText = "Adrienne Trek Jacket")
    private  WebElement itemElement;
    @FindBy(className = "messages")
    private  WebElement addCartMessage;

    public String itemIsDisplayed(){
        return itemElement.getText();
    }
    @Step
public void cart(){
        addCartButton.click();
        cartElement.click();
}
    @Step
    public boolean addCartMessageSuccessfully(){
     return   addCartMessage.isDisplayed();
}

}
