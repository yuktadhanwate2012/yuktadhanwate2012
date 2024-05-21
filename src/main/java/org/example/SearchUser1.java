package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchUser1 {
    WebDriver driver;
    public  SearchUser1( WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
