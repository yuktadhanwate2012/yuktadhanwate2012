package org.example;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DeleteUser1 {
    WebDriver driver;
    public DeleteUser1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By userModule=By.xpath("//div[@id='container_users']");
    public By newUser=By.xpath("//div[text()='New User']");
    public By firstName=By.xpath("//input[@id='createUserPanel_firstNameField']");
    public By lastName=By.xpath("//input[@id='createUserPanel_lastNameField']");
    public By email=By.xpath("//input[@id='createUserPanel_emailField']");
    public By dropDown=By.xpath("//div[@id='createUserPanel_accessToOtherProductSelectorPlaceholder']/following::div[9]");
    public By dept=By.xpath("//input[@id='createUserPanel_emailField']/following::div[text()='HR & Finance']");
    public By save=By.xpath("//div[text()='Save & Send Invitation']");
    public By close=By.xpath("//span[text()='Invite one more user']/following::span[1]");
    public By searchIcon=By.xpath("//th[text()='PTO Balance']/following::div[14]");
    public By userName=By.xpath("//th[text()='PTO Balance']/following::div[15]");
    public By success=By.xpath("//span[text()='Success1']");
}
