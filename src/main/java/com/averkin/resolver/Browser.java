package com.averkin.resolver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    private ChromeDriver driver;

    public void start(String url){
        driver=new ChromeDriver();
        driver.get(url);
    }

    public String getHtml(){
        return driver.findElement(By.xpath("//body")).getAttribute("innerHTML");
    }
}
