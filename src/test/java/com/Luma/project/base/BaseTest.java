package com.Luma.project.base;

import com.Luma.project.factory.DriverFactory;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.*;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
   public void setup() {
        driver = new DriverFactory().initializeDriver();
    }
    @AfterMethod
   public void teardown(ITestResult result)  {
        String testcaseName= result.getMethod().getMethodName();
     File destFile=new File("target"+File.separator+"screenshots"+File.separator+testcaseName+".png");
        takeScreenshots(destFile);
        driver.quit();
    }

    public void takeScreenshots(File destFile)  {
        File screenshotfile=( (TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {

            FileUtils.copyFile(screenshotfile,destFile);
            InputStream inputStream=new FileInputStream(destFile);
          Allure.addAttachment("screenshots",inputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
