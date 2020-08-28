package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day07_Tekrar {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver tekrar =new ChromeDriver();
        tekrar.manage().window().maximize();
        tekrar.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        tekrar.get("http://google.com");

        WebElement gSearch =tekrar.findElement(By.xpath("//input[@name='q']"));
        gSearch.sendKeys("mi pad 4 8 inch" + Keys.ENTER);

        WebElement ilkSite = tekrar.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
        ilkSite.click();




    }
}
