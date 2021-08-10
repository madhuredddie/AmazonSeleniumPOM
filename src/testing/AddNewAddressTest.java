package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.AddressPO;
import pom.LoginPO;

public class AddNewAddressTest {

    @Test
    public void addAddress() {
        // intialzing the driverf
        System.setProperty("webdriver.chrome.driver", "/home/masrg/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // initialzing the loginPo class with driver parameter and clicking on the
       // sign options with my credentials
        LoginPO page = new LoginPO(driver);
        page.setup();
        try {
           page.start();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("exception handled");
        }
        // creating AddressPo class object with driver parameter
        // in profile tab clicking on your address and  adding new address with the following data
        AddressPO addressPO = new AddressPO(driver);
        try {
            addressPO.profileClick().click();
            addressPO.addressOptionsClick().click();
            addressPO.addNewAddressClick().click();
            addressPO.fullNameType().sendKeys("Madhusudhanreddy Ganta");
            addressPO.phoneNumberType().sendKeys("9618597870");
            addressPO.pinCodeType().sendKeys("509209");
            addressPO.addressLine1Type().sendKeys("H.no 4-91,Sirsawada colony,sirsawada");
            addressPO.addressLine2Type().sendKeys("Thadoor mandal");
            addressPO.landMarkType().sendKeys("near sai baba temple");
            addressPO.addressCityType().sendKeys("Nagarkurnool");
            addressPO.addAddressButtonClick().click();
            // Asserting whether the the new adress is added or not
            String actual = driver.findElement(By.xpath("*//h4[@class='a-alert-heading']")).getText();
            Assert.assertEquals(actual, "Address saved");
        }
        catch (NoSuchElementException e)
        {
            System.out.println("exception handeled");
        }
    }
}
