package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void verifyGoogleTitle() {

        driver.get("https://www.google.com");

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains("Google"));
    }
}