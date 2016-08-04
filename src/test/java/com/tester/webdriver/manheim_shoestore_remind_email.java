package com.tester.webdriver;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class manheim_shoestore_remind_email {

    private static FirefoxDriver driver;
    WebElement element;

    @BeforeClass
    public static void openBrowser() {
        driver = new FirefoxDriver();
        driver.navigate().to("http://shoestore-manheim.rhcloud.com/");
    }

    @Test
    public void verifyRemindEmail() {

        WebElement emailInput = driver.findElement(By.cssSelector("#remind_email_input"));
        emailInput.sendKeys("tester1@testerbp.org");

        WebElement emailSubmit = driver.findElement(By.xpath("//*[@id=\"remind_email_form\"]/div/input[2]"));
        //validate Submit button is enabled
        Assert.assertTrue("Remind Email Submit button is enabled", emailSubmit.isEnabled());

        emailSubmit.click();

        WebElement emailSubmitMsg = driver.findElement(By.cssSelector("#flash .notice"));
        //validate Submit Message is now displayed
        Assert.assertTrue("Remind Email Submit message displays", emailSubmitMsg.isDisplayed());

        String emailMessage = emailSubmitMsg.getText();
        //validate Submit Message has proper text
        Assert.assertEquals("Remind Email Message contains proper text", "Thanks! We will notify you of our new shoes at this email: tester1@testerbp.org", emailMessage);

    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
