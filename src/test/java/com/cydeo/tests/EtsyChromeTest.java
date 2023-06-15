package com.cydeo.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EtsyChromeTest  extends  WebTestBase{


    @Test
    public void etsySearchTest() throws InterruptedException {


        driver.get("https://www.etsy.com");
        Thread.sleep(3000);
        WebElement searchField = driver.findElement(By.name("search_query")) ;
        searchField.sendKeys("Baklava" + Keys.ENTER);

        Thread.sleep(2000);

        WebElement results = driver.findElement(By.xpath("//span[contains(text(),'results,')]")) ;

        System.out.println("results = " + results.getText());


    }



}
