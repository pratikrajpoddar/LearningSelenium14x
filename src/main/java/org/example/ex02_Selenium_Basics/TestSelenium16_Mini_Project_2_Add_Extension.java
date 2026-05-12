package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_Mini_Project_2_Add_Extension {

    @Description ("Options Class")
    @Test
    public void test_Selenium01() throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");

        //chromeOptions.addArguments("--incognito");

      //  File path = new File("C:\\Users\\Admin\\IdeaProjects\\LearningSeleniumATB14x\\src\\main\\java\\org\\example\\ex02_Selenium_Basics\\AdBlocker.crx");
       // chromeOptions.addExtensions(path);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/watch?v=-huANJOH0XA&list=PLfP9A3syDpt_ase07yZacWmNMwEsCgh-_&index=6");

        Thread.sleep(5000);
        driver.quit();
    }
}
