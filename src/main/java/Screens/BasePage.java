package Screens;

import org.openqa.selenium.*;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void send(By locator, String text){
        find(locator).sendKeys(text);
    }
    public void sends(By locator,Keys enter){
        find(locator).sendKeys(enter);
    }

    public void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,2000)");
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector("li[id='journey-267688946'] button[class='open']")));
    }





}
