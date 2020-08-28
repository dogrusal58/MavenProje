package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_IlkDers {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://amazon.com");
       // WebElement aramakutusu = driver.findElement(By.xpath("input[@type='text']"));
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("samsung headphones" + Keys.ENTER);
        //aramakutusu.submit();(bunun yerine yukarıda Keys.ENTER kullanılabilir.

        WebElement ilkurun = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(ilkurun.getText());

       //List<WebElement> listem = driver.findElements(By.tagName("span"));
        List<WebElement> listem = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        System.out.println(listem.get(4));//4.elemanı bulur
        for(WebElement w : listem){
            System.out.println(w.getText());
        }
    }
}
