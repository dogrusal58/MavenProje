package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_BeforeAfterClass {
    @Test
    public void test1(){
        System.out.println("test 1 çalıştı");
    }


    @BeforeClass//annotationa sahip method her class çalışmadan önce çalışır.sadece bir kere çalışır.
    public static void setUp(){
        System.out.println("setup çalıştı");

    }
    @Test
    public void test2(){

        System.out.println("test 2 çalıştı");
    }

    @AfterClass//bu annotationa sahip method her classtaki tester çalıştırıldıktan sonra çalışır.sadece birkere çalışır
    public static void tearDown(){
        System.out.println("teardown çalıştı");

    }


}
