package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftNavigationPo {
    WebDriver driver;

    // creating the constructor with driver as parameter
    public LeftNavigationPo(WebDriver driver)
    {
        this.driver=driver;
    }
    // creating web elements required for the task in the test
    By allicon= By.className("hm-icon-label");
    By mobileoption= By.xpath("*//a[@data-menu-id='8']");
    By mobiles= By.linkText("All Mobile Phones");//By.xpath("*//a[@class='hmenu-item'][1]");
    By homeicon=By.id("nav-logo-sprites");
    By electronic =By.xpath("*//img[@alt='Electronics']");

    // creating the function required for the accessing the web elements
    public WebElement allIconClick() throws NoSuchElementException
    {
        return driver.findElement(allicon);
    }
    public WebElement mobilesOptionsClick() throws NoSuchElementException
    {
        return driver.findElement(mobileoption);
    }
    public WebElement mobilesClick() throws NoSuchElementException
    {
     return driver.findElement(mobiles);
    }
    public  WebElement electronicsvisible() throws NoSuchElementException
    {
        return driver.findElement(electronic);
    }
    public WebElement homeIconClick() throws NoSuchElementException
    {
        return driver.findElement(homeicon);
    }
}
