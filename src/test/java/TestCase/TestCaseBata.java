package TestCase;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.HomePage;
import pages.SignInPage;
import utilities.BrowserSetup;

import javax.swing.*;


public class TestCaseBata extends BrowserSetup {
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        AddToCart addtocart = new AddToCart();


        @BeforeMethod
        public void loadHomePage() throws InterruptedException {
            getBrowser().get(homePage.url);
            homePage.clickOnElement(homePage.signInButton);
            Thread.sleep(1000);
        }
        @Test
        @Description("Automation Testing of 'Bata' Website")

            public void LogInIntoBata() throws InterruptedException {
            signInPage.addScreenshot("before enter the email and pass");
            signInPage.writeOnElement(signInPage.emailInputBox, "cahev71384@eqvox.com");
            signInPage.writeOnElement(signInPage.passwordInputBox, "@A123456a@");
            signInPage.addScreenshot("after enter the email and pass");
            signInPage.clickOnElement(signInPage.logInButton);
            Assert.assertTrue(homePage.displayStatus(homePage.Assertcheck));
            signInPage.addScreenshot("Successfully Signin to the page");
            Thread.sleep(1000);


            //hover to Men

            Actions actions = new Actions(getBrowser());
            WebElement hoverelement = homePage.getElement(By.xpath("//body/div[@class='wrapper-header']/div[@id='shopify-section-navigation']/div[@id='sticky-wrapper']/div[@class='wrapper-navigation']/div[@class='main-menu jas-mb-style']/div[@class='container']/div[@class='row']/div[@class='col-12']/div[@class='mb-area']/nav[@role='navigation']/ul[@class='site-nav']/li[3]/a[1]/span[1]"));
            actions.clickAndHold(hoverelement).build().perform();
            signInPage.addScreenshot("After a Hover");
            Thread.sleep(1000);
            signInPage.clickOnElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1) > span:nth-child(1)"));
            Thread.sleep(1000);
            signInPage.clickOnElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1) > span:nth-child(1)"));
            Thread.sleep(1000);


            //scroll to go another page
            JavascriptExecutor js = (JavascriptExecutor) getBrowser();
            WebElement Scroll = homePage.getElement(By.xpath("//label[normalize-space()='11']"));
            js.executeScript("arguments[0].scrollIntoView();", Scroll);
            Thread.sleep(1000);
            homePage.clickOnElement(homePage.scroll2);
            Thread.sleep(1000);

            //scroll to get products from the 2nd page
            JavascriptExecutor js2 = (JavascriptExecutor) getBrowser();
            WebElement Scroll2 = homePage.getElement(By.cssSelector(".lazyautosizes.lazyloaded[data-srcset='//www.batabd.com/cdn/shop/files/2_fb5b0abb-db59-44e5-b1ce-daff59b9ebe3_300x.jpg?v=1712209772']"));
            js2.executeScript("arguments[0].scrollIntoView();", Scroll2);
            Thread.sleep(5000);

            //2nd page mouse hover and click

            Actions actions2 = new Actions(getBrowser());
            WebElement hoverelement2 = homePage.getElement(By.cssSelector(".lazyautosizes.lazyloaded[data-srcset='//www.batabd.com/cdn/shop/files/2_fb5b0abb-db59-44e5-b1ce-daff59b9ebe3_300x.jpg?v=1712209772']"));
            actions.clickAndHold(hoverelement2).build().perform();
            signInPage.addScreenshot(" select the product");
            Thread.sleep(2000);
            signInPage.clickOnElement(By.xpath("//div[@class='abs-bottom-mb']//form[@id='-7221917483091']"));
            Thread.sleep(2000);
            signInPage.clickOnElement(By.xpath("//div[@class='abs-bottom-mb']//form[@id='-7221917483091']"));
            Thread.sleep(2000);

            //scroll and add to cart
            signInPage.addScreenshot("after select the product");
            JavascriptExecutor js3 = (JavascriptExecutor) getBrowser();
            WebElement Scroll3 = homePage.getElement(By.xpath("//form[@id='add-to-cart-form']//input[@name='quantity']"));
            js.executeScript("arguments[0].scrollIntoView();", Scroll3);
            Thread.sleep(1000);
            homePage.clickOnElement(homePage.scroll3);
            Thread.sleep(1000);
            homePage.clickOnElement(homePage.scroll3);
            Thread.sleep(1000);

            //scroll to go add to cart and click
            signInPage.addScreenshot("Add to Cart");
            JavascriptExecutor js4 = (JavascriptExecutor) getBrowser();
            WebElement Scroll4 = homePage.getElement(By.xpath("//div[@class='nav-search']//input[@placeholder='SEARCH']"));
            js.executeScript("arguments[0].scrollIntoView();", Scroll4);
            Thread.sleep(1000);

            Actions actions3 = new Actions(getBrowser());
            WebElement hoverelement3 = homePage.getElement(By.xpath("//div[@class='wrapper-top-cart cart-icon']//span[@class='cartCount'][normalize-space()='2']"));
            actions.clickAndHold(hoverelement3).build().perform();
            Thread.sleep(6000);
            homePage.clickOnElement(homePage.scroll4);
            Thread.sleep(1000);
            homePage.clickOnElement(homePage.scroll4);
            Thread.sleep(1000);

            addtocart.addScreenshot(" enter the information to confirm the order");

            addtocart.clickOnElement(addtocart.country);
            addtocart.writeOnElement(addtocart.firstname, "Apurba Roy");
            addtocart.writeOnElement(addtocart.lastname, "Ajay");
            addtocart.writeOnElement(addtocart.address,"Firmgate");
            addtocart.clickOnElement(addtocart.div);
            addtocart.clickOnElement(addtocart.city);
            addtocart.clickOnElement(addtocart.thana);
            addtocart.writeOnElement(addtocart.postalcode,"1215");
            addtocart.writeOnElement(addtocart.phonenumber,"01675842235");


            JavascriptExecutor js5 = (JavascriptExecutor) getBrowser();
            WebElement Scroll5 = homePage.getElement(By.xpath("//label[@for='checkout_tnc-checkout']"));
            js5.executeScript("arguments[0].scrollIntoView();", Scroll5);
            Thread.sleep(1000);
            addtocart.clickOnElement(addtocart.selecttermcondition);

            addtocart.addScreenshot(" Successfully confirm the order");

            JavascriptExecutor js6 = (JavascriptExecutor) getBrowser();
            WebElement Scroll6 = addtocart.getElement(By.xpath("//a[normalize-space()='Log out']"));
            js5.executeScript("arguments[0].scrollIntoView();", Scroll6);
            Thread.sleep(1000);
            addtocart.clickOnElement(addtocart.logout);


        }








}
