package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BrowserTabOperation1 {
    WebDriver driver;
    public BrowserTabOperation1( WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By actitime=By.partialLinkText("actiTIME");
}
