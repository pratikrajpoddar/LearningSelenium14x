package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium12_Navigation_Get_NAVIGATED {
    @Description("Open the URL")
    @Test
    public void test_Selenium01(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
