package testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.LastMobilePO;
import pom.LoginPO;

public class LastMobileTest {
    @Test
    public void fetchLastMobile()
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
        // creating object of lastmobilepo and using functionalities to fetch last mobile checking whether the tittle is displayed
        LastMobilePO mobile = new LastMobilePO(driver);

        try
        {
            mobile.searchbarType().sendKeys("mobiles");
            mobile.searchbarType().sendKeys(Keys.ENTER);
            mobile.lastMobileClick().click();
            driver.navigate().to("https://www.amazon.in/Mi11XPro-Lunar-White-128GB-Storage/dp/B085J1KCGP/ref=sr_1_22_sspa?dchild=1&keywords=mobiles&qid=1625028409&sr=8-22-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzSEtWUFk1NFUxV0JOJmVuY3J5cHRlZElkPUEwMDkzMDk1REtRTTlYWDA3UkZCJmVuY3J5cHRlZEFkSWQ9QTAzNzYxMzRIUEdSUDVRRFg3R1cmd2lkZ2V0TmFtZT1zcF9idGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl");
            Assert.assertTrue(mobile.mobileLabelElement().isDisplayed());
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Exception handled");
        }


    }
}
