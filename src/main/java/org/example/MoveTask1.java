package org.example;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MoveTask1 {
    WebDriver driver;
    public MoveTask1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By task=By.xpath("//div[@id='container_tasks']");
    public By clickProject=By.xpath("//div[@class='text'][text()='Flight operations']");
    public By dropDown=By.xpath("//span[text()='Statuses']");
    public By radioButton=By.xpath("//label[text()='Selected']");
    public By newStatus=By.xpath("//span[text()='Open tasks']/following::span[4]");
    public By apply=By.xpath("//div[text()='Apply']");
    public By list=By.xpath("//tr[contains(@class,'taskRow')]/td[2]//div[@class='title']\n");
    public By checkBox=By.xpath("//div[@class='components-SearchInput-icon--mqgNLbmO']/following::div[10]");
    public By move=By.xpath("//div[@class='moveTo button'][text()='Move to']");
    public By selectCust=By.xpath("//div[text()='- Select Customer -']/following::div[5]");
    public By customer=By.xpath("//div[text()='- Select Customer -']/following::div[12]");
    public By projectDrop=By.xpath("//div[text()='Show archived customers (1)']/following::div[16]");
    public  By project=By.xpath("//div[@class='itemRow cpItemRow '][text()='Android prototyping']");
    public By moveButton= By.xpath("//div[@class='itemRow cpItemRow '][text()='Android testing']/following::div[20]");
    public  By check=By.xpath("//div[@class='components-SearchInput-icon--mqgNLbmO']/following::div[10]");
}
