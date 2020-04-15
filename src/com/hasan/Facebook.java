package com.hasan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Facebook {



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\Desktop\\New\\SeleniumProject1\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://www.facebook.com");
        String title = driver.getTitle();
        System.out.println(title);
       /* SoftAssert softAssert = new SoftAssert();
        try {
            softAssert.assertEquals(title, "Amazon.com:  Shopping for Electronics, Apparel, Computers, Books, DVDs & more",
                    "Title did not match. So you need to double check");
        }catch(Exception ex) {
            System.out.println("Title did not match. So you need to double check");
        }*/
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).sendKeys("Log In", Keys.ENTER);
        driver.close();
    }

}



