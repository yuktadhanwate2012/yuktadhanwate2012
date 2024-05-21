package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddUserWithBlank1 {
    WebDriver driver;
    public AddUserWithBlank1( WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By clickOnUser=By.xpath("//div[@id='container_users']");
    public By clickOnNewUser=By.xpath("//div[text()='New User']");
    public By firstName=By.xpath("//input[@id='createUserPanel_firstNameField']");
    public By lastName=By.xpath("//input[@id='createUserPanel_lastNameField']");
    public By email=By.xpath("//input[@id='createUserPanel_emailField']");
    public By dropdown=By.xpath("//div[@id='createUserPanel_accessToOtherProductSelectorPlaceholder']/following::div[9]");
    public By dept=By.xpath("//input[@id='createUserPanel_emailField']/following::div[text()='HR & Finance']");
    public By save=By.xpath("//div[text()='Save & Send Invitation']");
    public By emptyMsg=By.xpath("//div[@id='createUserPanel_firstNameEmptyError']");
    public By cancel=By.xpath("//span[text()='SAVING ...']/following::div[6]");
}
