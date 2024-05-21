package org.example;

import com.actitime.automation.ActitimePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateTask1 {
    WebDriver driver;

    public ActitimeCreateTask1(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By taskModule = By.xpath("//table[@id='topnav']/descendant::a[6]");
    public By project=By.xpath("//div[@class='collapsedContainer']/preceding::div[text()='Spaceship building']");
    public By addTask=By.xpath("//div[text()='Archived']/following::div[8]");
    public By taskName=By.xpath("//span[text()='Big Bang Company']/following::input[@placeholder='Enter Task Name']");
    public By deadLine=By.xpath("//div[@class='components-Deadline-date--vW8sYsk2 components-Deadline-withoutDate--ZujIxVzy']");
    public By date=By.xpath("//tbody[@class='rc-calendar-tbody']/descendant::div[2]");
    public By work=By.xpath("//div[text()='Priority']/preceding::div[1]");
    public By type=By.xpath("//span[text()='repair: complex ']/preceding::div[1]");
    public By priorityDrop=By.xpath("//div[text()='Priority']/following::button");
    public By priority=By.xpath("//div[@class='components-ScrollBar-thumb--W7rIi3z4']/preceding::span[4]");
    public By custom=By.xpath("//div[text()='Budget, $ (custom field)']/preceding::button[1]");
    public By budget=By.xpath("//div[text()='Budget, $ (custom field)']/following::input[1]");
    public By custom1=By.xpath("//div[text()='Code (custom field)']/following::input[1]");
    public By addTask1=By.xpath("//body/div[45]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]");
}
