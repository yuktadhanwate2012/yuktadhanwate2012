package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCost1 {
    WebDriver driver;
   public AddCost1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By clickOnUser=By.xpath("//div[text()='Users'][@class='label']");
    public By filters=By.xpath("//span[@id='ext-gen471']");
    public By radioButton=By.xpath("//div[@id='ext-gen513']/child::img");
    public By user=By.xpath("(//span[text()='Womack, Ashley'])[2]");
    public By applyButton=By.id("ext-comp-1648");
    public By correctUser=By.xpath("//span[@class='userNameSpan'][text()='Womack, Ashley']");
    public By selectedUser=By.xpath("(//span[text()='Womack, Ashley'])[1]");
    public By addRate=By.xpath("(//span[@class='label'][text()='Add rates'])[1]");
    public By enterRate=By.xpath("//div[@id='PLANNING_TOOLTIP']/following::input[1]");
    public By cross=By.xpath("(//div[@class='hideButton_panelContainer'])[1]");
    public  By dollarSign=By.xpath("//thead[@id='userListTableHeader']/following::div[12]");
    public  By accountSet=By.xpath("(//span[text()='ACCOUNT SETTINGS'])[1]");
}
