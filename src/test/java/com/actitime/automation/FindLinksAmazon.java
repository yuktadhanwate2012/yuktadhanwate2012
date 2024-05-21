package com.actitime.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class FindLinksAmazon extends BaseClass{
    WebDriver driver;
    @Test
    public void setUp() throws IOException {
        driver=launchBrowser("chrome");

        driver.get("https://www.amazon.in/");

        List<WebElement> webElementList =driver.findElements(By.tagName("a"));

        //iterate through the list to get element
        for(WebElement  element :webElementList){
            String link =element.getAttribute("href");
            if(link != null && ! link.startsWith("javascript")){
                //System.out.println(link);
                //To convert String url to URL
                URL url=new URL(link);

                //To opening the connection for an URL using port
                URLConnection Connection =url.openConnection();

                //cast connection variable into HttpURLConnection
                HttpURLConnection urlConnection=(HttpURLConnection)Connection;//downcasting

                urlConnection.connect();

                int statusCode=urlConnection.getResponseCode();

                if(statusCode!=200){
                    System.out.println("The broken url "+ " "+statusCode +" "+ link);

                }


            }

        }
        driver.quit();
    }
}


