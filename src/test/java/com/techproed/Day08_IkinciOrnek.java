package com.techproed;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_IkinciOrnek {
    static WebDriver driver;
    @BeforeClass // class çalışmaya başlayınca çalışacak
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass // class çalışmayı bitirince çalışacak
    public static void tearDown(){
        driver.quit();
    }
    @Before // her test methodundan önce çalışacak
    public void testtenOnce(){
        driver.get("https://google.com");
    }
    @After // her test methodundan sonra çalışacak
    public void testtenSonra(){
        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());
    }
    @Test
    public void test1(){
        WebElement aramakutusu = driver.findElement(By.name("q"));
        aramakutusu.sendKeys("huawei mediapad m5 8.4" + Keys.ENTER);
    }
    @Test
    public void test2(){
        WebElement aramakutusu =driver.findElement(By.name("q"));
        aramakutusu.sendKeys("mi pad 4" + Keys.ENTER);
    }
    @Test
    public void test3(){
        WebElement aramakutusu =driver.findElement(By.name("q"));
        aramakutusu.sendKeys("mi max 3" + Keys.ENTER);

    }

}