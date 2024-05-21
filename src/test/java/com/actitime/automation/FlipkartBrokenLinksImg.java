package com.actitime.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class FlipkartBrokenLinksImg extends BaseClass {
    WebDriver driver;
    @Test
    public void setUp() throws IOException {
        driver=launchBrowser("chrome");
        driver.get("https://www.flipkart.com/");
        List<WebElement> webElementList=driver.findElements(By.tagName("img"));
        for(WebElement element:webElementList){
            String link=element.getAttribute("src");
            //System.out.println(link);
            if(!link.startsWith("data:image/svg+xml;")){
                // System.out.println(link);
                URL url=new URL(link);
                URLConnection connection=url.openConnection();
                HttpURLConnection urlConnection=(HttpURLConnection)connection;
                urlConnection.connect();
                int statusCode=urlConnection.getResponseCode();
                if(statusCode!=200){
                    System.out.println("The broken url "+statusCode +" "+link);
                }

            }
        }
    }
}

