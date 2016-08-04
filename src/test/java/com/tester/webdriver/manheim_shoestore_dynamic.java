package com.tester.webdriver;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class manheim_shoestore_dynamic {

    private static FirefoxDriver driver;
    WebElement element;

    @BeforeClass
    public static void openBrowser() {
        driver = new FirefoxDriver();
        driver.navigate().to("http://shoestore-manheim.rhcloud.com/");
    }

    @Test
    public void verifyShoeReleases() {
        List<WebElement> months = driver.findElements(By.cssSelector("#header_nav ul li a"));
        System.out.println("Number of Months: " + months.size());
        ArrayList<String> hrefs = new ArrayList<String>();

        for (WebElement var : months) {
            hrefs.add(var.getAttribute("href"));
        }

        int i=0;
        for (String href : hrefs) {
            driver.navigate().to(href);
            System.out.println((++i)+": navigated to URL with href: "+href);

            List<WebElement> shoes = driver.findElements(By.id("shoe_list li"));
            System.out.println("Number of Shoe list elements: " + shoes.size());
            int shoe_list = shoes.size();

            //verify shoe prices total items match shoe list total
            List<WebElement> shoe_price = driver.findElements(By.cssSelector(".shoe_price"));
            System.out.println("Shoe Prices displayed: " + shoe_price.size());
            int shoe_prices = shoe_price.size();
            Assert.assertEquals("Shoe Prices displayed matches Shoe list total", shoe_prices, shoe_list);

            //verify shoe description total items match shoe list total
            List<WebElement> shoe_description = driver.findElements(By.cssSelector(".shoe_description"));
            System.out.println("Shoe Descriptions displayed: " + shoe_description.size());
            int shoe_descriptions = shoe_description.size();
            Assert.assertEquals("Shoe Descriptions matches Shoe list items total", shoe_descriptions, shoe_list);

            //verify shoe images total items match shoe list total
            List<WebElement> shoe_image = driver.findElements(By.cssSelector(".shoe_image"));
            System.out.println("Shoe Images displayed: " + shoe_image.size());
            int shoe_images = shoe_image.size();
            Assert.assertEquals("Shoe Images displayed matches Shoe list items total", shoe_images, shoe_list);

        }
    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();
        driver.quit();
    }
}