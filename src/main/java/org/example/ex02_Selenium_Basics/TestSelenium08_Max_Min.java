package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium08_Max_Min {

    @Test
    public void test_1() throws InterruptedException{

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        driver.manage() .window() .maximize();

        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
    }
}
