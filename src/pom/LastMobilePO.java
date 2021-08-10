package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LastMobilePO {
    WebDriver driver;
    // intialzing the constructor with driver
    public LastMobilePO(WebDriver driver)
    {
        this.driver=driver;
    }
    By serachbar = By.id("twotabsearchtextbox");
    By lastMobile= By.xpath("*//img[@data-image-index='22']");
    By mobilelabel= By.xpath("*//span[@id='productTitle']");

    public WebElement searchbarType() throws NoSuchElementException
    {
        return driver.findElement(serachbar);
    }
    public WebElement lastMobileClick() throws NoSuchElementException
    {
        return driver.findElement(lastMobile);
    }
    public WebElement mobileLabelElement() throws NoSuchElementException
    {
        return driver.findElement(mobilelabel);
    }
}
