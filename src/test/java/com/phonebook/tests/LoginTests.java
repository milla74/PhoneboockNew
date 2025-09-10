package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
        @Test
    public void loginPositiveTest(){
    //click on Login link
    click(By.cssSelector("[href='/login']"));
    //enter email
    type(By.name("email"), "manual22@gmail.com");

    //enter password
    type(By.name("password"), "Manuel12345$");

    //click on Login button
    click(By.name("login"));

    //verify Sign Out button is display
    Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));



}
}
