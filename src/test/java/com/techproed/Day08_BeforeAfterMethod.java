package com.techproed;
import org.junit.*;
//@Before ve@After da stattic olmayacak.her testten önce ve sonra çalışırlar.100 test varsa 100 kes çalışırlar.
public class Day08_BeforeAfterMethod {
    @BeforeClass
    public static void setUp(){
        System.out.println("setup çalıştı");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("teardown çalıştı");
    }
    @Before
    public  void MethoddanOnce(){
        System.out.println("@before çalıştı.");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 çalıştı..");
    }
    @Test
    public void test2(){
        System.out.println("Test 2 çalıştı..");
    }
    @After
    public void MethoddanSonra(){
        System.out.println("@after çalıştı..");
    }
}