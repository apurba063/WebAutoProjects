package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToCart extends BasePage{

    public String url = "https://www.batabd.com/22879679/checkouts/0ae5c056ab7dcd91f90299c103356e8d";

    public  By country = By.xpath("//option[@selected='selected']");
    public By firstname = By.xpath("//input[@id='checkout_shipping_address_first_name']") ;
    public By lastname = By.xpath("//input[@id='checkout_shipping_address_last_name']");

    public  By address = By.xpath("//input[@id='checkout_shipping_address_address1']");

    public  By div = By.xpath("//option[@vallue='Dhaka Division']");
    public  By city = By.xpath("//option[@vallue='Dhaka']");
    public  By thana = By.xpath("//option[@vallue='Tejgaon']");

    public  By postalcode = By.xpath("//input[@id='checkout_shipping_address_zip']");
    public  By phonenumber = By.xpath("//input[@id='checkout_shipping_address_phone']");

    public  By selecttermcondition = By.xpath("//input[@id='checkout_tnc-checkout']");
  public By logout = By.xpath("//a[normalize-space()='Log out']");



}