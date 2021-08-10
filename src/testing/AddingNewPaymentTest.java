package testing;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.AddingNewPaymentPO;
import pom.LoginPO;

public class AddingNewPaymentTest {

    @Test
    public void addPayment()
    {
        //setting up the  chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/masrg/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // creating object of login page and changing the browser size
        LoginPO page = new LoginPO(driver);
        page.setup();
        try {
            // going to google.com and browse to ammzon .in and sign in into my account
            page.start();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("exception handled");
        }
        // creating object of AddingNewPaymetPo and using methods to click on profile then click on payment options and
        // whether the already added card has Name on the card
        AddingNewPaymentPO payment= new AddingNewPaymentPO(driver);
        try
        {
            payment.profileclick().click();
            payment.paymentOptionClick().click();
            payment.creditCardClick().click();
            String actual= payment.NameOnCardCheck().getText();
            Assert.assertEquals(actual,"Name on card");
        }
        catch (NoSuchElementException e)
        {
           // System.out.println("Exception handled");
            e.printStackTrace();
        }
    }
}
