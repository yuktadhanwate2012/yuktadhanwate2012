package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DatePickerExample1 {
    WebDriver driver;
    public DatePickerExample1( WebDriver driver){
       this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By taskModule=By.xpath("//table[@id='topnav']/descendant::a[6]");
    public By project=By.xpath("//div[@class='collapsedContainer']/preceding::div[text()='Spaceship building']");
    public By taskButton=By.xpath("//div[text()='Archived']/following::div[8]");
    public By taskName=By.xpath("//span[text()='Big Bang Company']/following::input[@placeholder='Enter Task Name']");
    public By typeWork=By.xpath("//div[text()='Priority']/preceding::div[1]");
    public By work=By.xpath("//span[text()='repair: complex ']/preceding::div[1]");
    public By priority=By.xpath("//div[text()='Value (custom field)']/preceding::button[1]");
    public By priority2=By.xpath("//div[@class='components-ScrollBar-thumb--W7rIi3z4']/preceding::span[4]");
    public By customField=By.xpath("//div[text()='Budget, $ (custom field)']/preceding::button[1]");
    public By customField2=By.xpath("//div[@class='components-ScrollBar-track--SfQp92qY']/preceding::button[3]");

}
