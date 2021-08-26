package Screens;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
    WebDriver driver;

    By memberLogin = By.cssSelector(".login");
    By fromWhereLocator = By.cssSelector("#origin-input");
    By toWhereLocator = By.id("destination-input");
    By selectIndexLocator = By.xpath("//li[contains(text(),'Eskişehir')]");
    By selectIndexTwoLocator = By.xpath("//li[contains(text(),'Ankara')]");
    By calanderClickLocator = By.xpath("//label[normalize-space()='Yolculuk Tarihi']");
    By clickNextButtonLocator = By.cssSelector(".next");
    By clickDayLocator = By.xpath("//span[normalize-space()='14']");
    By searchButtonLocator = By.cssSelector("#search-button");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUp() {
        click(memberLogin);

    }

    public void fromWhereSearch(String text) throws InterruptedException {
        click(fromWhereLocator);
        send(fromWhereLocator, text);
        Thread.sleep(2000);
        click(selectIndexLocator);

    }


    public void toWhereSearch(String text) throws InterruptedException {
        click(toWhereLocator);
        send(toWhereLocator, text);
        Thread.sleep(2000);
        click(selectIndexTwoLocator);

    }

    public void calanderSelect() throws InterruptedException {
        click(calanderClickLocator);
    }

    public void forCalanderSelect() throws InterruptedException {
        int i;
        for (i = 1; i<3;) {
            click(clickNextButtonLocator);
            i++;
        }

    }
    public void calanderSelectDay()  {
        click(clickDayLocator);
    }

    public void searchButton() {
        click(searchButtonLocator);
    }


}
