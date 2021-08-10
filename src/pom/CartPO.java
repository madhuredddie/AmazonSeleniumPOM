package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPO {
    public WebDriver driver;
    //  creating constructor with driver as parameter
    public CartPO(WebDriver driver)
    {
        this.driver= driver;
    }
    // creating web elements
    By addToCart= By.id("add-to-cart-button");
    By cart= By.xpath("*//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']");
    By cartQuantity=By.className("a-dropdown-prompt");

    public WebElement addToCartClick() throws NoSuchElementException
    {
        return driver.findElement(addToCart);
    }

    public WebElement cartClick() throws NoSuchElementException
    {
        return  driver.findElement(cart);
    }

    public WebElement cartQuantityCheck() throws NoSuchElementException
    {
        return driver.findElement(cartQuantity);
    }
}
