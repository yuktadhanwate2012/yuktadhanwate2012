package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateDepartment1 {
    WebDriver driver;
    public CreateDepartment1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By user=By.xpath("//div[@id='container_users']");
    public By dept=By.xpath("//div[@id='userListTabs']/following::div[5]");
    public By deptName=By.xpath("//input[@id='groupManagementLightBox_newGroupInput']");
    public By clickDept=By.xpath("//button[@id='groupManagementLightBox_addGroupButton']");
    public By text=By.xpath("//div[text()='Testing']");
}
