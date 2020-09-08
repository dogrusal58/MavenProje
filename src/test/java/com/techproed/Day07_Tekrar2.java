package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_Tekrar2 {
    public static void main(String[] args) {
        WebDriverManager.operadriver().setup();
        WebDriver tekrar2 =new OperaDriver();
        tekrar2.manage().window().maximize();
        tekrar2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        tekrar2.get("https://www.amazon.com.tr");

        WebElement aramaKutusu =tekrar2.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("bilgisayar çantası" + Keys.ENTER);

       //WebElement istenilenUrun = tekrar2.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        WebElement istenilenUrun = tekrar2.findElement(By.xpath("//div[@data-component-id='18']"));
        istenilenUrun.click();
        String LinkUrl = tekrar2.getCurrentUrl();
        System.out.println(LinkUrl);

        List<WebElement> listem = tekrar2.findElements(By.tagName("a"));
        for(WebElement w:listem){
            System.out.println(w.getText());
        }




    }
}
