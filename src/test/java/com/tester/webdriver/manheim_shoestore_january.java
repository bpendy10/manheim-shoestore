package com.tester.webdriver;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class manheim_shoestore_january {

    private static FirefoxDriver driver;
    WebElement element;

    @BeforeClass
    public static void openBrowser() {
        driver = new FirefoxDriver();
        driver.navigate().to("http://shoestore-manheim.rhcloud.com/");
    }


    @Test
    public void verifyJanuaryNavigation(){
        //verify January URL
        WebElement januaryLink = driver.findElement(By.cssSelector("#header_nav li:nth-of-type(1) a"));
        String janUrl = januaryLink.getAttribute("href");
        Assert.assertEquals("Logo url should contain /months/january", "http://shoestore-manheim.rhcloud.com/months/january", janUrl);

        //verify January link title
        januaryLink.click();
        WebElement januaryTitle = driver.findElement(By.cssSelector(".title h2"));
        String janTitle = januaryTitle.getText();
        Assert.assertEquals("January title should contain Januarys Shoes", "January's Shoes", janTitle);
    }


    @Test
    public void verifyJanuaryShoe1() {
        //verify January shoe link #1 (brand/name/description/image/release month/price)
        //verify January shoe link #1 brand label
        WebElement januaryLink = driver.findElement(By.cssSelector("#header_nav li:nth-of-type(1) a"));
        januaryLink.click();
        WebElement januaryShoe1Brand = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 kendall\\27 crystal_pump .shoe_result_value.shoe_brand"));
        String janShoe1Brand = januaryShoe1Brand.getText();
        Assert.assertEquals("January Shoe No1 Brand label is Jimmy Choo", "Jimmy Choo", janShoe1Brand);

        //verify January shoe link #1 brand name
        WebElement januaryShoe1Name = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 kendall\\27 crystal_pump .shoe_result_value.shoe_name"));
        String janShoe1Name = januaryShoe1Name.getText();
        Assert.assertEquals("January Shoe No1 Brand Name is Jimmy Choo 'Kendall' Crystal Pump", "Jimmy Choo 'Kendall' Crystal Pump", janShoe1Name);

        //verify January shoe link #1 description
        WebElement januaryBlurb1 = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 kendall\\27 crystal_pump .shoe_result_value.shoe_description"));
        String janBlurb1 = januaryBlurb1.getText();
        Assert.assertEquals("January Shoe No1 Blurb contains text", "A scintillating mix of crystals casts flashbulb dazzle across a red carpet–ready pump, perched atop a slim heel. Jimmy Choo 'Kendall' Crystal Pump Jimmy Choo Jimmy Choo Pumps Shoes Approx. heel height: 5 3/4\" with 1 1/2\" platform (comparable to a 4 1/4\" heel). Measurements taken from size 39 EU and may vary slightly by size. Metallic leather upper/leather lining and sole. Made in Italy. Salon Shoes.", janBlurb1);

        //verify January shoe link #1 image
        WebElement januaryShoe1Image = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 kendall\\27 crystal_pump .shoe_image img"));
        String janShoe1Image = januaryShoe1Image.getAttribute("src");
        Assert.assertTrue("Image is displayed", januaryShoe1Image.isDisplayed());
        Assert.assertEquals("January Shoe No1 Image contains img url", "http://content.nordstrom.com/ImageGallery/store/product/Thumbnail/2/_7548482.jpg", janShoe1Image);

        //verify January shoe link #1 release month
        WebElement januaryShoe1RelMonth = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 kendall\\27 crystal_pump .shoe_release_month"));
        String janShoe1RelMonth = januaryShoe1RelMonth.getText();
        Assert.assertEquals("January Shoe No1 Release Month contains January", "January", janShoe1RelMonth);

        //verify January shoe link #1 price
        WebElement januaryPrice1 = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 kendall\\27 crystal_pump .shoe_result_value.shoe_price"));
        String janPrice1 = januaryPrice1.getText();
        Assert.assertTrue("Price is displayed", januaryPrice1.isDisplayed());
        Assert.assertEquals("January Shoe No1 Price contains $2995", "$2,995.00", janPrice1);

    }


    @Test
    public void verifyJanuaryShoe2() {
        //verify January Shoe Link #2 (description/image/price)
        //verify January shoe link #2 description
        WebElement januaryBlurb2 = driver.findElement(By.cssSelector("#brian_atwood_brian_atwood\\27 tribeca_laser\\27 sandal .shoe_result_value.shoe_description"));
        String janBlurb2 = januaryBlurb2.getText();
        Assert.assertEquals("January Shoe No2 Description contains text", "Diminutive studs trace the intricate waves of a sky-high, summer-breeze sandal. Brian Atwood 'Tribeca Laser' Sandal BRIAN ATWOOD Brian Atwood Sandals/Slides Shoes Approx. heel height: 6\" with 1 1/2\" platform (comparable to a 4 1/2\" heel). Suede upper/leather lining and sole. Made in Italy. Salon Shoes.", janBlurb2);

        //verify January shoe link #2 image
        WebElement januaryShoe2Image = driver.findElement(By.cssSelector("#brian_atwood_brian_atwood\\27 tribeca_laser\\27 sandal .shoe_image img"));
        String janShoe2Image = januaryShoe2Image.getAttribute("src");
        Assert.assertTrue("Image is displayed", januaryShoe2Image.isDisplayed());
        Assert.assertEquals("January Shoe No2 Image contains img url", "http://content.nordstrom.com/ImageGallery/store/product/Thumbnail/16/_7397736.jpg", janShoe2Image);

        //verify January shoe link #2 price
        WebElement januaryPrice2 = driver.findElement(By.cssSelector("#brian_atwood_brian_atwood\\27 tribeca_laser\\27 sandal .shoe_result_value.shoe_price"));
        String janPrice2 = januaryPrice2.getText();
        Assert.assertTrue("Price is displayed", januaryPrice2.isDisplayed());
        Assert.assertEquals("January Shoe No2 Price contains $1695", "$1,695.00", janPrice2);

    }


    @Test
    public void verifyJanuaryShoe3() {
        //verify January Shoe Link #3 (description/image/price)
        //verify January shoe link #3 description
        WebElement januaryBlurb3 = driver.findElement(By.cssSelector("#sergio_rossi_sergio_rossi\\27 mermaid\\27 caged_sandal .shoe_result_value.shoe_description"));
        String janBlurb3 = januaryBlurb3.getText();
        Assert.assertEquals("January Shoe No3 Description contains text", "Suede waves dotted with Swarovski crystals create an airy sandal lifted by a super-slim wrapped heel. Sergio Rossi 'Mermaid' Caged Sandal SERGIO ROSSI Sergio Rossi Sandals/Slides Shoes Back zip closure. Approx. heel height: 4\". Suede, satin and Swarovski crystal upper/leather lining and sole. Imported. Salon Shoes.", janBlurb3);

        //verify January shoe link #3 image
        WebElement januaryShoe3Image = driver.findElement(By.cssSelector("#sergio_rossi_sergio_rossi\\27 mermaid\\27 caged_sandal .shoe_image img"));
        String janShoe3Image = januaryShoe3Image.getAttribute("src");
        Assert.assertTrue("Image is displayed", januaryShoe3Image.isDisplayed());
        Assert.assertEquals("January Shoe No3 Image contains img url", "http://content.nordstrom.com/ImageGallery/store/product/Thumbnail/2/_7354422.jpg", janShoe3Image);

        //verify January shoe link #3 price
        WebElement januaryPrice3 = driver.findElement(By.cssSelector("#sergio_rossi_sergio_rossi\\27 mermaid\\27 caged_sandal .shoe_result_value.shoe_price"));
        String janPrice3 = januaryPrice3.getText();
        Assert.assertTrue("Price is displayed", januaryPrice3.isDisplayed());
        Assert.assertEquals("January Shoe No3 Price contains $1670", "$1,670.00", janPrice3);

    }


    @Test
    public void verifyJanuaryShoe4() {
        //verify January shoe link #4 (description/image/price)
        //verify January shoe link #4 description
        WebElement januaryBlurb4 = driver.findElement(By.cssSelector("#charlotte_olympia_charlotte_olympia\\27 priscilla\\27 genuine_python_pump .shoe_result_value.shoe_description"));
        String janBlurb4 = januaryBlurb4.getText();
        Assert.assertEquals("January Shoe No4 Description contains text", "Pre-order this style today! Add to Shopping Bag to view approximate ship date. You'll be charged only when your item ships.Exotic python and exuberant emerald take a signature pump to exhilarating heights of style. Charlotte Olympia 'Priscilla' Genuine Python Pump CHARLOTTE OLYMPIA Charlotte Olympia Pumps Shoes Approx. heel height: 5 3/4\" with 1 1/2\" platform (comparable to a 4 1/4\" heel). Genuine python upper/leather lining and sole. Made in Italy. Salon Shoes.", janBlurb4);

        //verify January shoe link #4 image
        WebElement januaryShoe4Image = driver.findElement(By.cssSelector("#charlotte_olympia_charlotte_olympia\\27 priscilla\\27 genuine_python_pump .shoe_image img"));
        String janShoe4Image = januaryShoe4Image.getAttribute("src");
        Assert.assertTrue("Image is displayed", januaryShoe4Image.isDisplayed());
        Assert.assertEquals("January Shoe No4 Image contains img url", "http://content.nordstrom.com/ImageGallery/store/product/Thumbnail/6/_7469486.jpg", janShoe4Image);

        //verify January shoe link #4 price
        WebElement januaryPrice4 = driver.findElement(By.cssSelector("#charlotte_olympia_charlotte_olympia\\27 priscilla\\27 genuine_python_pump .shoe_result_value.shoe_price"));
        String janPrice4 = januaryPrice4.getText();
        Assert.assertTrue("Price is displayed", januaryPrice4.isDisplayed());
        Assert.assertEquals("January Shoe No4 Price contains $1495", "$1,495.00", janPrice4);

    }


    @Test
    public void verifyJanuaryShoe5() {
        //verify January shoe link #5 (description/image/price)
        //verify January shoe link #5 description
        WebElement januaryBlurb5 = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 diva\\27 sandal .shoe_result_value.shoe_description"));
        String janBlurb5 = januaryBlurb5.getText();
        Assert.assertEquals("January Shoe No5 Description contains text", "Scintillating architecture and precision-set crystals create captivating after-dark sparkle on a cut-out, champagne sandal. Jimmy Choo 'Diva' Sandal Jimmy Choo Jimmy Choo Sandals/Slides Shoes Back zip closure. Approx. heel height: 5\" with 3/4\" platform. Leather upper, lining and sole. Made in Italy. Salon Shoes.", janBlurb5);

        //verify January shoe link #5 image
        WebElement januaryShoe5Image = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 diva\\27 sandal .shoe_image img"));
        String janShoe5Image = januaryShoe5Image.getAttribute("src");
        Assert.assertTrue("Image is displayed", januaryShoe5Image.isDisplayed());
        Assert.assertEquals("January Shoe No5 Image contains img url", "http://content.nordstrom.com/ImageGallery/store/product/Thumbnail/12/_7383352.jpg", janShoe5Image);

        //verify January shoe link #5 price
        WebElement januaryPrice5 = driver.findElement(By.cssSelector("#jimmy_choo_jimmy_choo\\27 diva\\27 sandal .shoe_result_value.shoe_price"));
        String janPrice5 = januaryPrice5.getText();
        Assert.assertTrue("Price is displayed", januaryPrice5.isDisplayed());
        Assert.assertEquals("January Shoe No5 Price contains $1495", "$1,495.00", janPrice5);
    }


    @AfterClass
    public static void closeBrowser() {
        driver.close();
        driver.quit();
    }
}

