package com.hasan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class FacebookTest {

    WebDriver driver = null;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\Desktop\\New\\SeleniumProject1\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.Facebook.com");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

    @Test
    public void testTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        SoftAssert softAssert = new SoftAssert();
        try {
            softAssert.assertEquals(title, "Facebook: Log in",
                    "Title did not match. So you need to double check");
        }catch(Exception ex) {
            System.out.println("Title did not match. So you need to double check");
        }
    }

    @Test
    public void testTypingOnSearchBox() {
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).sendKeys("Log In", Keys.ENTER);

    }
}


