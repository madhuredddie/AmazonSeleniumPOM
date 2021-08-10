package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPO
{
    public WebDriver driver;
    public AddressPO(WebDriver driver)
    {
        this.driver=driver;
    }
    By profie = By.id("nav-link-accountList-nav-line-1");
    By addressOption= By.xpath("*//img[@alt='Your Addresses']");
            //<img alt="Your Addresses" src="https://images-na.ssl-images-amazon.com/images/G/31/x-locale/cs/ya/images/address-map-pin._CB485934183_.png">
    By addNewAddress =By.id("ya-myab-plus-address-icon");
    By fullName = By.id("address-ui-widgets-enterAddressFullName");
    By phoneNumber= By.id("address-ui-widgets-enterAddressPhoneNumber");
    By pinCode= By.id("address-ui-widgets-enterAddressPostalCode");
    By addressLine1 = By.id("address-ui-widgets-enterAddressLine1");
    By addressLine2= By.id("address-ui-widgets-enterAddressLine2");
    By landMark = By.id("address-ui-widgets-landmark");
    By addressCity= By.id("address-ui-widgets-enterAddressCity");
   By stateDropdown= By.xpath("*//span[@class='a-button-text a-declarative'][2]");
   By stateSelect = By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_31");
   By addAddressButton = By.xpath("*//input[@class='a-button-input']");

   public WebElement profileClick() throws NoSuchElementException
   {
       return driver.findElement(profie);
   }
   public WebElement addressOptionsClick() throws NoSuchElementException
   {
       return driver.findElement(addressOption);
   }
   public WebElement addNewAddressClick() throws NoSuchElementException
   {
       return driver.findElement(addNewAddress);
   }
   public WebElement fullNameType() throws NoSuchElementException
   {
       return  driver.findElement(fullName);
   }
   public WebElement phoneNumberType() throws NoSuchElementException
   {
       return driver.findElement(phoneNumber);
   }
   public WebElement pinCodeType() throws NoSuchElementException
   {
       return driver.findElement(pinCode);
   }
   public WebElement addressLine1Type()throws NoSuchElementException
   {
       return  driver.findElement(addressLine1);
   }
   public WebElement addressLine2Type() throws NoSuchElementException
   {
       return  driver.findElement(addressLine2);
   }
   public  WebElement landMarkType() throws NoSuchElementException
   {
       return driver.findElement(landMark);
   }
   public WebElement addressCityType() throws NoSuchElementException
   {
       return driver.findElement(addressCity);
   }
   public WebElement stateDrpodownClick() throws NoSuchElementException
   {
       return driver.findElement(stateDropdown);
   }
   public  WebElement stateSelectClick() throws NoSuchElementException
   {
       return driver.findElement(stateSelect);
   }
   public WebElement addAddressButtonClick() throws NoSuchElementException
   {
       return driver.findElement(addAddressButton);
   }
}
