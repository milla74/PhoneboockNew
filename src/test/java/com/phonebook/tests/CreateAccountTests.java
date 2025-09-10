package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest(){

        int i =(int)((System.currentTimeMillis()/1000)%3600);
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email
        type(By.name("email"), "manual22"+i+"@gmail.com");
        //enter password
        type(By.name("password"), "Manuel12345$");

        //click on Registration button
        click(By.name("registration"));

        //verify Sign Out button is display
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));//css div:nth-child(1) button
    }

    @Test()
        public void existedUserRegistrationNegativeTest(){
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email
        type(By.name("email"), "manual22@gmail.com");

        //enter password
        type(By.name("password"), "Manuel12345$");

        //click on Registration button
        click(By.name("registration"));

        //verify Alert is displayed
            Assert.assertTrue(isAlertDisplayed());

    }


}
