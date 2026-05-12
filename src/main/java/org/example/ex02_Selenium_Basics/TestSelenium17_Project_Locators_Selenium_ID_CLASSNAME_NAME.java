package org.example.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
//import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

public class TestSelenium17_Project_Locators_Selenium_ID_CLASSNAME_NAME extends CommonToAll {

    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Pratik Raj")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_login_invalid_login() {


        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com");
       // driver.manage().window().maximize();
       // driver.get("https://app.vwo.com");

        WebElement email_input_box =  driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        WebElement password_input_box =  driver.findElement(By.name("password"));
        password_input_box.sendKeys("wrongpass@123");

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        customWait(3000);


        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");






/*        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);

        }
        driver.quit();*/

        closeBrowser(driver);





    }
}
