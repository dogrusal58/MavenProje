package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_Tekrar {

    static WebDriver tekrar;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        tekrar = new ChromeDriver();
        tekrar.manage().window().maximize();
        tekrar.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterClass
    public static void tearDown(){
        tekrar.quit();
    }
    @Before
    public void HerTestOncesi(){
        tekrar.get("https://amazon.com.tr");

    }
    @After
    public void HerTestSonrası(){
        WebElement sonucSayisi = tekrar.findElement(By.xpath("//div[@class='sg-col-inner']"));
        //System.out.println(sonucSayisi.getText());
        String sonuc = sonucSayisi.getText();
        System.out.println(sonuc);
    }
    @Test
    public void AramaTesti1(){
        WebElement AramaKutusu = tekrar.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        AramaKutusu.sendKeys("tablet pc"+Keys.ENTER);
        try {
            Thread.sleep(1500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }


    }
    @Test
    public void AramaTesti2(){
        WebElement AramaKutusu = tekrar.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        AramaKutusu.sendKeys("tablet çantası"+Keys.ENTER);

        try {
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
