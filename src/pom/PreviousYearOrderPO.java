package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreviousYearOrderPO {

    public WebDriver driver;
    // constructor
    public PreviousYearOrderPO(WebDriver driver)
    {
        this.driver=driver;
    }
    // creating 'By' elements
    By profie = By.id("nav-link-accountList-nav-line-1");
    By yourOrdersOption= By.xpath("*//img[@alt='Your Orders']");
    By orderHistory = By.xpath("*//span[@class='a-dropdown-prompt']");
    By orderHistoryOption= By.id("orderFilter_3");

    public WebElement profileClick() throws NoSuchElementException
    {
        return driver.findElement(profie);
    }
    public  WebElement yourOrderOptionClick() throws NoSuchElementException
    {
        return driver.findElement(yourOrdersOption);
    }
    public WebElement orderHistoryClick() throws NoSuchElementException
    {
        return driver.findElement(orderHistory);
    }

    public WebElement orderHistoryOptionClick () throws NoSuchElementException
    {
        return  driver.findElement(orderHistoryOption);
    }
}
