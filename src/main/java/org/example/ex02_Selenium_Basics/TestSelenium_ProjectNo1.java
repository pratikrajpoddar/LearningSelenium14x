package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.example.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo1 extends CommonToAll {

    @Description ("TC# - Verify that a particular text exist on this katalon websites")
    @Link("https://bugz.atlassian.net/browse/VP-1")
    @Test
    public void test_verify_text(){
        WebDriver driver = new FirefoxDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com");

        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println(" Test Case Passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Test Case Failed");
            Assert.assertTrue(false);
        }
    }



}
