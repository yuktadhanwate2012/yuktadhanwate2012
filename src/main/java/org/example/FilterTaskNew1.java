package org.example;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FilterTaskNew1 {
    WebDriver driver;

    public FilterTaskNew1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By taskModule = By.xpath("//table[@id='topnav']/descendant::a[6]");
     public By filters=By.xpath("//span[text()='Add filters']");
    public By status=By.xpath("//h3[text()='Configure Filters']/following::span[1]");
    public By apply=By.xpath("//div[text()='Apply']");
    public By dropDown=By.xpath("//span[text()='Statuses']");
    public By radioButton=By.xpath("//label[text()='Selected']");
    public By newStatus=By.xpath("//span[text()='Open tasks']/following::span[1]");
    public By list=By.xpath("//tr[contains(@class,'taskRow')]/td[3]//div[text()='New']");


    //VerifySearchBox class
    public By task=By.xpath("//div[@id='container_tasks']");
    public By searchBox=By.xpath("//div[@id='taskManagementPage']/descendant::input[1]");
    public By customer=By.xpath("//span[text()='ABC1234']");


}
