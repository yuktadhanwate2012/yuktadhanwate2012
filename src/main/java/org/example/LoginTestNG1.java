package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestNG1 {
    WebDriver driver;
   public LoginTestNG1( WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By username=By.name("username");
   public By password=By.name("pwd");
   public By login=By.xpath("//div[text()='Login '] ");
   public By error=By.xpath("//div[@id='ClientSideErrorMessage']/preceding::span");
   public By error3=By.xpath("//table[@id='ErrorsTable']/descendant::span");
   public By error4=By.xpath("//div[@id='ClientSideErrorMessage']/preceding::span");
}
