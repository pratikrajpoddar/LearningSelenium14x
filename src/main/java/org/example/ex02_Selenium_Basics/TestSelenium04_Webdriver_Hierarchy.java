package org.example.ex02_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium04_Webdriver_Hierarchy {
    public static void main (String[] args){
        //Webdriver hierarchy
        // SearchContext (I) -> (2) -> WebDriver(I)( ~10) -> RemoteWebDriver(C)  (~15)
         SearchContext driver = new FirefoxDriver();
        SearchContext driver1 = new EdgeDriver();
        SearchContext driver2 = new ChromeDriver();




    }
}
