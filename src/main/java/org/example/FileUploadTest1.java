package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FileUploadTest1 {
    WebDriver driver;
    public FileUploadTest1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By pim=By.xpath("//span[text()='Admin']/following::a[1]");
    public By addButton=By.xpath("//button[text()=' Search ']/following::button[1]");
    public By plusicon=By.xpath("//h6[text()='Add Employee']/following-sibling::form//i");

}
