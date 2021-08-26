package Tests;

import Screens.BasePage;
import Screens.CompanySelect;
import Screens.HomePage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTicketsTest extends BaseTest {
public static Logger Log= LogManager.getLogger(BaseTest.class.getName());




    @Test
    public void searchTickets() throws InterruptedException {

        HomePage hp = new HomePage(driver);
        hp.fromWhereSearch("Eskişehir");
        hp.toWhereSearch("Ank");
        hp.calanderSelect();
        hp.forCalanderSelect();
        hp.calanderSelectDay();
        hp.searchButton();

        BasePage bp = new BasePage(driver);
        bp.scrollPage();

        CompanySelect cs = new CompanySelect(driver);
        cs.selectCompany();
        Thread.sleep(1000);
        Assert.assertEquals(cs.validateAmount(), "61,00 TL");
        Log.info("Fiyatlar eşleşti");
        Thread.sleep(1000);
        cs.approveTicket();


    }
}
