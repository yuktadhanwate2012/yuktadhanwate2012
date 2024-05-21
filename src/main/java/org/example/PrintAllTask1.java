package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrintAllTask1 {
    WebDriver driver;
    public  PrintAllTask1( WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By task=By.xpath("//div[@id='container_tasks']");
    public By project=By.xpath("//div[@class='collapsedContainer']/preceding::div[text()='Spaceship building']");
    public By list=By.xpath("//tr[contains(@class,'taskRow')]/td[2]//div[@class='title']");
    public By checkBox=By.xpath("//div[@class='components-SearchInput-icon--mqgNLbmO']/following::div[12]");
    public By moveTo=By.xpath("//div[@class='bulkOperationsPanel']/descendant::div[3]");
    public By custDropdown=By.xpath("//div[text()='- Select Customer -']");
    public By selectCust=By.xpath("//div[text()='- Select Customer -']/following::div[10]");
    public By projectDrop=By.xpath("//div[@class='emptySelection'][text()='- Select Project -']");
    public By selectProject=By.xpath("//div[@class='itemRow cpItemRow '][text()='Flight operations']");
    public By moveYo=By.xpath("(//div[@class='ok button' and text()='Move'])[2]");
    public By chechBox2=By.xpath("//div[@class='checkbox inactive disabled']");

}
