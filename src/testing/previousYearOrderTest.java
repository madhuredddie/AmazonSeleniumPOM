package testing;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.LoginPO;
import pom.PreviousYearOrderPO;

public class previousYearOrderTest {
    @Test
    public void checkingpreviousorder() {
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

        PreviousYearOrderPO order= new PreviousYearOrderPO(driver);
        try
        {
            order.profileClick().click();
            order.yourOrderOptionClick().click();
            order.orderHistoryClick().click();
            order.orderHistoryOptionClick().click();
            String actual = order.orderHistoryClick().getText();
            Assert.assertEquals(actual,"2020");
        }
        catch(NoSuchElementException e)
        {
            System.out.println("exception handled");
        }
    }

}
