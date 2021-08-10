package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Assignment2Test {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "/home/masrg/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.fb.com");
        String actual= driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.facebook.com/");
        Assert.assertTrue(driver.findElement(By.xpath("*//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).isDisplayed());
        String mainwindow = driver.getWindowHandle();
        System.out.println(mainwindow);
        driver.findElement(By.xpath("*//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Set<String> childwindows = driver.getWindowHandles();
        Iterator<String> iterator= childwindows.iterator();

        while (iterator.hasNext()) {
            String window = iterator.next();
            driver.switchTo().window(window);
            driver.findElement(By.name("firstname")).sendKeys("firtsname");
            driver.findElement(By.name("lastname")).sendKeys("surname");
            driver.findElement(By.name("reg_email__")).sendKeys("6303615851");
            driver.findElement(By.name("reg_passwd__")).sendKeys("password@123");
            driver.findElement(By.name("birthday_day")).click();
            driver.findElement(By.xpath("*//option[@value='10']")).click();
           Select selmonth=  new Select(driver.findElement(By.id("month")));
           // Select selyear= new Select(driver.findElement(By.id("year")));
            driver.findElement(By.id("month")).click();
            selmonth.selectByVisibleText("Jun");
            //driver.findElement(By.xpath("*//option[@value='8'][2]")).click();
            driver.findElement(By.id("year")).click();
           driver.findElement(By.xpath("*//option[@value='1989']")).click();
           driver.findElement(By.xpath("*//input[@type='radio' and @value='2']")).click();
           driver.findElement(By.name("websubmit")).click();
        }


    }
}
