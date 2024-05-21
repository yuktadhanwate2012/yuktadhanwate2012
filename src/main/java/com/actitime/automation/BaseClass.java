package com.actitime.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseClass {
    WebDriver driver;

    //launch the browser
    public WebDriver launchBrowser(String browserName) {   //Edge
        switch (browserName){
            case "chrome":
                ChromeOptions options=new ChromeOptions();     //capabilities
                options.setBrowserVersion("121");
                options.addArguments("--remote-allow-origins=*");
                options.addArguments("--start-maximized");

                driver=new ChromeDriver(options);
                break;

            case "edge"  :
                EdgeOptions edgeOptions=new EdgeOptions();
                edgeOptions.setBrowserVersion("stable");

                driver=new EdgeDriver(edgeOptions);
                break;

            case "firefox":
                FirefoxOptions firefoxOptions=new FirefoxOptions();
                firefoxOptions.setBrowserVersion("stable");

                driver =new FirefoxDriver(firefoxOptions);
                break;

            default:
                ChromeOptions options1=new ChromeOptions();
                options1.setBrowserVersion("stable");
                options1.addArguments("--remote-allow-origins=*");

                driver=new ChromeDriver(options1);
                break;

        }
        driver.manage().window().maximize();
        return driver;
    }}


