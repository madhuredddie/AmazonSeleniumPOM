package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.LoginPO;

public class Todaysdealtest {


    //WebDriver driver= new ChromeDriver();
    @Test
    public  void login()
    {
        //setting up the  chrome driver
        System.setProperty("webdriver.chrome.driver","/home/masrg/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // initialzing the loginPo nad suing function to navigate www.amazon.in and login into my account
        LoginPO page = new LoginPO(driver);
        page.setup();
        page.start();
        // Asserting whether it is my account or not by check profile name
        String actual=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
        Assert.assertEquals(actual,"Hello, G.madhu");
        page.searchBarTypingInAmazon().sendKeys("Todays deal");
        page.searchBarTypingInAmazon().sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("*//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();

    }


}
