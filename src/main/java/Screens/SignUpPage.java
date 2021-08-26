package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {
     WebDriver driver;
    By uyeOlButtonLocator = By.cssSelector(".sign-up.login-to-register");
    By email = By.cssSelector("input[placeholder='E-posta Adresi']");
    By password = By.cssSelector("input[placeholder='Parola']");
    By signUpButtonLocator = By.cssSelector("button[class='register register-button']");
    By testCheckLocator = By.cssSelector("div[class='header user-sign-up login-header'] h2");


    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void getUyeOlButton(){
        click(uyeOlButtonLocator);

    }

    public void getEmail(String text){
        send(email,text);
    }

    public void getPassword(String text){
        send(password,text);

    }
    public void getSignUpButton(){
        click(signUpButtonLocator);
    }

    public String testCheck(){
    return  find(testCheckLocator).getText();


    }


}
