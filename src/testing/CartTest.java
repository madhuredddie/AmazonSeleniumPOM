package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.CartPO;
import pom.LoginPO;

public class CartTest {
    // checking whther item is added to cart ot not
    @Test
    public void CheckingitemAddedToCart() {
        //setting up the  chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/masrg/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // creating object of login page and changing the browser size
        LoginPO page = new LoginPO(driver);
        page.setup();
        try {
            // going to google.com and browse to ammzon .in and sign in into my account
            page.start();
        } catch (NoSuchElementException e) {
            System.out.println("exception handled");
        }
        // intilazing the CartPo object and using the functionalities to add item in the cart and check whethr tha added item quantity is one or not
        CartPO cart = new CartPO(driver);
        try {
            driver.navigate().to("https://www.amazon.in/Mi11XPro-Lunar-White-128GB-Storage/dp/B085J1KCGP/ref=sr_1_22_sspa?dchild=1&keywords=mobiles&qid=1625028409&sr=8-22-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzSEtWUFk1NFUxV0JOJmVuY3J5cHRlZElkPUEwMDkzMDk1REtRTTlYWDA3UkZCJmVuY3J5cHRlZEFkSWQ9QTAzNzYxMzRIUEdSUDVRRFg3R1cmd2lkZ2V0TmFtZT1zcF9idGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl");
             cart.addToCartClick().click();
             cart.cartClick().click();
            String actual = driver.findElement(By.className("a-dropdown-prompt")).getText();
            Assert.assertEquals(actual, "1");
        }
         catch (NoSuchElementException e)
         {
             System.out.println("Exception Handled");
         }
    }
}
