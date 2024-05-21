package org.example;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateProject1 {
    WebDriver driver;
    public CreateProject1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By taskModule=By.xpath("//table[@id='topnav']/descendant::a[6]");
    public By addNew=By.xpath("//div[text()='Add New']");
    public By addProject=By.xpath("//div[text()='+ New Project']");
    public By blank=By.xpath("//div[text()='Project name cannot be empty']/preceding::input[1]");
    public By dropDown=By.xpath("//div[text()='-- Please Select Customer to Add Project for  --']");
    public By customer=By.xpath("//div[text()='-- New Customer --']/following-sibling::div[2]");
    public By createProject=By.xpath("//div[text()='Create Project']");
    public By errorMsg=By.xpath("//div[text()='Project name cannot be empty']");
    public By cancel=By.xpath("//div[text()='Create Project']/following::div[2]");
}
