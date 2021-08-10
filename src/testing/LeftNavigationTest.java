package testing;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.LeftNavigationPo;
import pom.LoginPO;

public class LeftNavigationTest {

    @Test
    public void checkLeftNavigation()
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
       //creating the object of LeftNavigationPo and using the functionalities to click and check whether the locators are present or not
        LeftNavigationPo navigation= new LeftNavigationPo(driver);
          try
          {
              navigation.allIconClick().click();
              navigation.mobilesOptionsClick().click();
              navigation.mobilesClick().click();
              Assert.assertTrue(navigation.electronicsvisible().isDisplayed());
              navigation.homeIconClick().click();
          }
          catch (NoSuchElementException e)
          {
              e.printStackTrace();
          }
          catch (Exception e)
          {
              e.printStackTrace();
          }
    }
}
