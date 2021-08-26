package Screens;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompanySelect extends BasePage {
    WebDriver driver;

 By chooseSeatLocator = By.cssSelector("li[id='journey-267688946'] button[class='open']");
 By seatClickLocator= By.xpath("//div[@class='wrapper']//*[local-name()='svg']//*[name()='a'][12]");
 By genderLocator= By.cssSelector(".male");
 By validateLocator = By.xpath("//span[@class='content notranslate']");
 By approveLocator = By.xpath("//span[@class='ready']");

    public CompanySelect(WebDriver driver) {
        super(driver);
    }

    public void selectCompany() throws InterruptedException {
        click(chooseSeatLocator);
        click(seatClickLocator);
        click(genderLocator);

    }

    public void approveTicket(){
        click(approveLocator);
    }

    public String validateAmount(){
        return find(validateLocator).getText();
    }


}
