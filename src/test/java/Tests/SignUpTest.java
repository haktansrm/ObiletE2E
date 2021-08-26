package Tests;

import Screens.HomePage;
import Screens.SignUpPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {


    public static Logger Log= LogManager.getLogger(BaseTest.class.getName());


    String name = "Üye Ol";




    @Test
    public  void signUpButton() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        hp.clickSignUp();

        SignUpPage sup = new SignUpPage(driver);

        sup.getUyeOlButton();
        Assert.assertEquals(sup.testCheck(),name);
        Log.info("İsimler eşleşti");


        Thread.sleep(2000);

        sup.getEmail("srmali@mail.com");
        sup.getPassword("123456a");
        sup.getSignUpButton();
        Log.info("Başarılı giriş");




    }



}
