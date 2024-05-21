package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrangehrmLogin1 {
    WebDriver driver;
    public OrangehrmLogin1( WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By dashboard=By.xpath("//h6[text()='Dashboard']");
    public By errorMsg=By.xpath("//input[@name='_token']/preceding::p[3]");
    public By getErrorMsg2=By.xpath("//input[@name='_token']/preceding::p[3]");
    public By reqMsg1=By.xpath("//label[text()='Username']/following::span[1]");
    public By reqMsg2=By.xpath("//label[text()='Username']/following::span[2]");
    public By getErrorMsg5=By.xpath("//label[text()='Username']/following::span");
    public By getErrorMsg6=By.xpath("//label[text()='Username']/following::span[1]");
    public By getErrorMsg7=By.xpath("//input[@name='_token']/preceding::p[3]");
}
