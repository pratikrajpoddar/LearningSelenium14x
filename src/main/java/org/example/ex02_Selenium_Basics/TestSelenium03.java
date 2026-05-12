package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium03 {
    public static void main (String[] args){

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://sdet.live");
    }

}
