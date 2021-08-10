package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddingNewPaymentPO {

    public WebDriver driver;
    // creating constructor of AddingNewPaymentPo with driver as parameter
    public AddingNewPaymentPO(WebDriver driver)
    {
        this.driver=driver;
    }

    By profie = By.id("nav-link-accountList-nav-line-1");
    By paymentOption = By.xpath("*//img[@alt='Payment options']");
    By creditcard= By.xpath("*//img[@alt='HDFC Bank Debit Card']");
    By NameOnCard= By.xpath("*//span[@class='a-text-bold'][1]");

    public WebElement profileclick() throws NoSuchElementException
    {
        return driver.findElement(profie);
    }
    public  WebElement paymentOptionClick() throws NoSuchElementException
    {
        return driver.findElement(paymentOption);
    }
    public  WebElement creditCardClick() throws NoSuchElementException
    {
        return driver.findElement(creditcard);
    }
    public WebElement NameOnCardCheck() throws NoSuchElementException
    {
        return driver.findElement(NameOnCard);
    }


}
