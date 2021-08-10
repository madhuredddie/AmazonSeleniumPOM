package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment3Test {
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver", "/home/masrg/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://flipkart.com");
        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        Iterator<WebElement> iterator= links.iterator();
        while (iterator.hasNext())
        {
            String text= iterator.next().getText();
            String link= iterator.next().getAttribute("href");
            System.out.println("text on site is "+text);
            System.out.println("Link of the "+text+" is "+link);
        }
    }
}
