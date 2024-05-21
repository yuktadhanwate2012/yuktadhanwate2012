package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer1 {
    WebDriver driver;
    public DeleteCustomer1(WebDriver driver){
       this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public By task=By.xpath("//div[text()='Tasks']");
    public By addNew=By.xpath("//div[text()='Add New']");
    public By newCustomer=By.xpath("//div[text()='+ New Customer']");
    public By addcust=By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']");
    public By custName=By.xpath("//div[text()='Create Customer']");
    public By createCustomer=By.xpath("//div[text()='Create Customer']");
    public By customer=By.xpath("//div[@class='text'][text()='ABC1234']");
    public By customerName=By.xpath("//div[@title='ABC1234']/following-sibling::div");
    public By dots=By.xpath("(//div[text()='ACTIONS'])[1]");
    public By delete=By.xpath("(//div[@class='title'][text()='Delete'])[1]");
    public By permanent=By.xpath("//span[text()='Delete permanently']");

}
