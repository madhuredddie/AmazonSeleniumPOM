package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Assignment4Test {

     public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "/home/masrg/Downloads/chromedriver_linux64/chromedriver");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.navigate().to("https://www.snapdeal.com");
         driver.findElement(By.xpath("*//span[@class='accountUserName col-xs-12 reset-padding']")).click();
         String mainwindow = driver.getWindowHandle();
        // System.out.println(mainwindow);
         driver.findElement(By.xpath("*//a[@href='https://www.snapdeal.com/login']")).click();
         Set<String> childwindows = driver.getWindowHandles();
         Iterator<String> iterator= childwindows.iterator();

         while (iterator.hasNext()) {
             String window = iterator.next();
         //    System.out.println(window);
           // driver.switchTo().window(window);

         }
        driver.findElement(By.id("userName")).sendKeys("gantamadhusdhanreddy@gmail.com");

    }
}
