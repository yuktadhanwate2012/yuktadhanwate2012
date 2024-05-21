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

public class FindLinkAmazonimg extends BaseClass{
    @Test
    public void setUp() throws IOException {
        WebDriver driver=launchBrowser("chrome");
        //navigate to url
        driver.get("https://www.amazon.in/");

        //
        List<WebElement> webElementList=driver.findElements(By.tagName("img"));

        //
        for(WebElement webElement:webElementList){
            String link=webElement.getAttribute("src");
            //System.out.println(link);

            //to convert string url to actual url
            URL url=new URL(link);

            //open connection for url using port
            URLConnection connection=url.openConnection();

            //cast connection variable to HttpURLConnection
            HttpURLConnection urlConnection =(HttpURLConnection)connection;
            //hit the url
            urlConnection.connect();
            //get status code
            int statusCode=urlConnection.getResponseCode();

            if(statusCode!=200){
                System.out.println("The broken link : " +statusCode +" "+link);
            }


        }
        driver.quit();
    }
}


