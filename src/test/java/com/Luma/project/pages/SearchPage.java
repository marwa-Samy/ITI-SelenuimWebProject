package com.Luma.project.pages;

import com.Luma.project.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="search")
    private WebElement searshElement;

    @FindBy(xpath ="//*[@id=\"search_mini_form\"]/div[2]/button" )
 private    WebElement searchButton;

    @FindBy(css ="[data-ui-id='page-title-wrapper']" )
  private   WebElement resultMessage;
    @Step
    public boolean resultMessageIsDisplayed(){
        return resultMessage.isDisplayed();
    }
    @Step
    public void search(String item){
        searshElement.sendKeys(item);
        searchButton.click();
    }
}
