package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogin1 {
    WebDriver driver;
    public ActitimeLogin1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By taskModule=By.xpath("//table[@id='topnav']/descendant::a[6]");
    public By checkBox=By.xpath("//div[@class='createdTasksTableContainer']/following::div[3]");
    public By changeStatus=By.xpath("//div[text()='Assign to']/following-sibling::div[1]");
    public By dropDown=By.xpath("//div[text()='New Status:']/following::div[3]");
    public By planningStatus=By.xpath("//div[text()='click to view project settings']/following::div[28]");
    public  By apply=By.xpath("//span[text()='Apply']");
}
