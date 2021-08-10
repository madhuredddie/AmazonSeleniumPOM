package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1Test {

    public static void main(String[] args)
    {
        //setting up the  chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/masrg/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.navigate().to("https://qatechhub.com/");
        driver.get("https://qatechhub.com/");
         String actual= driver.getTitle();
         //System.out.println(actual);
        Assert.assertEquals(actual,"QA Automation Tools Trainings and Tutorials | QA Tech Hub");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
         String url = driver.getCurrentUrl();
         System.out.println(url);
         driver.navigate().refresh();
         driver.quit();
    }
}
