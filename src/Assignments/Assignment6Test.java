package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Assignment6Test {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "/home/masrg/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("*//input[@class='_2IX_2- VJZDxU']")).sendKeys("gantamadhusudhanreddy@gmail.com");
        driver.findElement(By.xpath("*//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Madhu@123");
        driver.findElement(By.xpath("*//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
        driver.quit();


    }
}
