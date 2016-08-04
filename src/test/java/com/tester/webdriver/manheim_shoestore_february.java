package com.tester.webdriver;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class manheim_shoestore_february {

    private static FirefoxDriver driver;
    WebElement element;

    @BeforeClass
    public static void openBrowser() {
        driver = new FirefoxDriver();
        driver.navigate().to("http://shoestore-manheim.rhcloud.com/");
    }

    @Test
    public void verifyFebruaryNavigation(){
        //verify February URL
        WebElement februaryLink = driver.findElement(By.cssSelector("#header_nav li:nth-of-type(2) a"));
        String febUrl = februaryLink.getAttribute("href");
        Assert.assertEquals("Logo url should contain /months/february", "http://shoestore-manheim.rhcloud.com/months/february", febUrl);

        //verify February link title
        februaryLink.click();
        WebElement februaryTitle = driver.findElement(By.cssSelector(".title h2"));
        String febTitle = februaryTitle.getText();
        Assert.assertEquals("February title should contain Februarys Shoes", "February's Shoes", febTitle);
    }

    @Test
    public void verifyFebruaryShoe1(){
        //verify February Shoe Link #1 (description/image/price)
        //verify February shoe link #1 description
        WebElement februaryLink = driver.findElement(By.cssSelector("#header_nav li:nth-of-type(2) a"));
        februaryLink.click();
        WebElement februaryBlurb1 = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 kera\\27 platform_sandal .shoe_result_value.shoe_description"));
        String febBlurb1 = februaryBlurb1.getText();
        Assert.assertEquals("February Shoe No1 Description contains text", "Brilliant crystals dazzle the T-strap style of a scintillating platform sandal balanced by a slim, wrapped heel. Jimmy Choo 'Kera' Platform Sandal Jimmy Choo Jimmy Choo Sandals/Slides Shoes Approx. heel height: 4 1/4\" with 1/2\" platform. Measurements taken from size 39 EU and may vary slightly by size. Back zip closure. Suede upper/leather lining and sole. Made in Italy. Salon Shoes.", febBlurb1);

        //verify February shoe link #1 image
        WebElement februaryShoe1Image = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 kera\\27 platform_sandal .shoe_image img"));
        String febShoe1Image = februaryShoe1Image.getAttribute("src");
        Assert.assertTrue("Image is displayed", februaryShoe1Image.isDisplayed());
        Assert.assertEquals("February Shoe No1 Image contains img url", "http://content.nordstrom.com/ImageGallery/store/product/Thumbnail/19/_7548379.jpg", febShoe1Image);

        //verify February shoe link #1 price
        WebElement februaryPrice1 = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 kera\\27 platform_sandal .shoe_result_value.shoe_price"));
        String febPrice1 = februaryPrice1.getText();
        Assert.assertTrue("Price is displayed", februaryPrice1.isDisplayed());
        Assert.assertEquals("February Shoe No1 Price contains $2195", "$2,195.00", febPrice1);

    }


    @Test
    public void verifyFebruaryShoe2(){
        //verify February Shoe Link #2 (description/image/price)
        //verify February shoe link #2 description
        WebElement februaryBlurb2 = driver.findElement(By.cssSelector("#valentino_valentino\\27 camo_rockstud\\27 pump .shoe_result_value.shoe_description"));
        String febBlurb2 = februaryBlurb2.getText();
        Assert.assertEquals("February Shoe No2 Description contains text", "Pre-order this style today! Add to Shopping Bag to view approximate ship date. You'll be charged only when your item ships.Golden pyramid studs glint on the caged straps of a crystallized leather pump with a slim heel and pointed toe. Valentino 'Camo Rockstud' Pump VALENTINO Valentino Pumps Shoes Approx. heel height: 4\". Adjustable strap with buckle closure. Leather upper, lining and sole. Made in Italy. Salon Shoes.", febBlurb2);

        //verify February shoe link #2 image
        WebElement februaryShoe2Image = driver.findElement(By.cssSelector("#valentino_valentino\\27 camo_rockstud\\27 pump img"));
        String febShoe2Image = februaryShoe2Image.getAttribute("src");
        Assert.assertTrue("Image is displayed", februaryShoe2Image.isDisplayed());
        Assert.assertEquals("February Shoe No2 Image contains img url", "http://content.nordstrom.com/ImageGallery/store/product/Thumbnail/10/_7491570.jpg", febShoe2Image);

        //verify February shoe link #2 price
        WebElement februaryPrice2 = driver.findElement(By.cssSelector("#valentino_valentino\\27 camo_rockstud\\27 pump .shoe_result_value.shoe_price"));
        String febPrice2 = februaryPrice2.getText();
        Assert.assertTrue("Price is displayed", februaryPrice2.isDisplayed());
        Assert.assertEquals("February Shoe No2 Price contains $1595", "$1,595.00", febPrice2);

    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();
        driver.quit();
    }

}
