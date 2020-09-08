package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//pdf 8 örneği
//titleTest => Sayfa başlığının “Google” oldugunu doğrulayın
//imageTest => Google resminin görüntülenip görüntülenmediğini
//( isDisplayed() ) doğrulayın
//gmailLinkTest => "Gmail" linkinin görüntülenip görüntülenmediğini
//( isDisplayed() ) doğrulayın

public class AssertIsDisplayedOrnek {

    static WebDriver tekrar;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        tekrar =new ChromeDriver();
        tekrar.manage().window().maximize();
        tekrar.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Before
    public void herTesttenOnce(){
        tekrar.get("https://google.com");
    }
    @After
    public void herTesttenSonra(){
        tekrar.quit();
    }
    @Test
    public void titleTest(){

        String gTitle = tekrar.getTitle();
       // Assert.assertEquals("Google",gTitle);
        //WebElement sayfaBasligi = tekrar.findElement(By.);
        boolean iceriyorMu =gTitle.contains("Google");
        Assert.assertTrue(iceriyorMu);
    }
    @Test
    public void imageTest(){
        WebElement gResim = tekrar.findElement(By.id("hplogo"));
        boolean gorunuyorMu = gResim.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }
    @Test
    public void gmailLinkTest(){
        WebElement gmailLink = tekrar.findElement(By.partialLinkText("Gmail"));
        boolean gMailLinkGorme =gmailLink.isDisplayed();
        Assert.assertTrue(gMailLinkGorme);
    }
}
