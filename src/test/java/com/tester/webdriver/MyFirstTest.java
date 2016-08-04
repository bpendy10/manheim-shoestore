package com.tester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by Brandon Pendergraft on 7/28/16.
 */
public class MyFirstTest {

    @Test
    public void startWebDriver() {
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://att.yahoo.com");

        //verify att.net page Title
        Assert.assertTrue("Title should start with att.net", driver.getTitle().startsWith("att.net"));

        //verify att.net Logo URL
        WebElement logo = driver.findElement(By.cssSelector("a.YLogoMY"));
        String logoUrl = logo.getAttribute("href");
        Assert.assertEquals("Logo url should contain att.net", "https://att.net/", logoUrl);

        //verify att.net Logo Image url location
        String logoImageUrl = logo.getCssValue("background-image");
        Assert.assertEquals("Logo url should contain att.net", "url(\"https://s1.yimg.com/rz/d/sprite_att_en-US_f_p_bestfit.png\")", logoImageUrl);

        //verify Powered By logo URL
        WebElement poweredByLogo = driver.findElement(By.cssSelector("a.pbylogo"));
        String pbylogoUrl = poweredByLogo.getAttribute("href");
        Assert.assertEquals("Powered By Logo url should equal att.net", "https://att.net/", pbylogoUrl);

        //validate Top Bar color (AT&T Blue #009fdb)
        WebElement topBar = driver.findElement(By.cssSelector("#Eyebrow"));
        String topBarColor = topBar.getCssValue("background-color");
        Assert.assertEquals("Top bar color for AT&T should be Blue", "rgba(0, 159, 219, 1)", topBarColor);

        //validate Top Bar links size
        List topBarLinks = topBar.findElements(By.tagName("a"));
        Assert.assertEquals(26, topBarLinks.size());

        //validate Top Bar:Mail label
        WebElement topBarMail = driver.findElement(By.cssSelector("#yucs-top-mail"));
        String mailLabel = topBarMail.getText();
        Assert.assertEquals("Top Bar - Mail label should equal 'Mail'", "Mail", mailLabel);

        //validate Top Bar:Mail URL
        WebElement topBarMailLink = driver.findElement(By.cssSelector("#yucs-top-mail a"));
        String mailUrl = topBarMailLink.getAttribute("href");
        Assert.assertEquals("Top Bar:Mail link should equal Mail url", "http://mail.yahoo.com/?.partner=sbc", mailUrl);

        driver.close();
        driver.quit();

    }
}
