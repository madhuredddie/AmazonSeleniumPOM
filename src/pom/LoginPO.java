package pom;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class LoginPO {

    public WebDriver driver;



    public LoginPO(WebDriver driver)
    {
        this.driver=driver;
    }
    By searchBarType = By.name("q");
    By amazonLink = By.xpath("*//div[@class='cfxYMc JfZTW c4Djg MUxGbd v0nnCb']");
    By signIn= By.id("nav-link-accountList-nav-line-1");
    By email= By.id("ap_email");
    By password= By.id("ap_password");
    By serachbar = By.id("twotabsearchtextbox");

    public void setup(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    public WebElement searchBarTypingInChrome() throws NoSuchElementException
    {
        return driver.findElement(searchBarType);
    }
    public WebElement amzonLinkclicking() throws NoSuchElementException
    {
        return  driver.findElement(amazonLink);
    }
    public WebElement signInLoactor() throws NoSuchElementException
    {
        return driver.findElement(signIn);
    }
    public WebElement emailTyping() throws NoSuchElementException
    {
        return driver.findElement(email);
    }
    public  WebElement passwordType() throws NoSuchElementException
    {
        return driver.findElement(password);
    }

    public WebElement searchBarTypingInAmazon() throws NoSuchElementException
    {
        return driver.findElement(serachbar);
    }
    public void start()
    {
        searchBarTypingInChrome().sendKeys("www.amazon.in");
        searchBarTypingInChrome().sendKeys(Keys.ENTER);
        amzonLinkclicking().click();
        signInLoactor().click();
        emailTyping().sendKeys("gantamadhusudhanreddy@gmail.com");
        emailTyping().sendKeys(Keys.ENTER);
        passwordType().sendKeys("Madhu@123");
        passwordType().sendKeys(Keys.ENTER);
    }

}
