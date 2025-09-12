package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateAccountTests extends TestBase{

    SoftAssert softAssert = new SoftAssert();

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest(){

       //int i =(int)((System.currentTimeMillis()/1000)%3600);
        clickOnLoginLink();
        fillRegisterLoginForm(new User().setEmail("manual22@gmail.com").setPassword("Manuel12345$"));
        clickOnRegistrationButton();
        Assert.assertTrue(isSignOutButtonPresent());//css div:nth-child(1) button
    }

    @Test()
        public void existedUserRegistrationNegativeTest(){

        clickOnLoginLink();
        fillRegisterLoginForm(new User().setEmail("manual22@gmail.com").setPassword("Manuel12345$"));
        clickOnRegistrationButton();
        softAssert.assertTrue(isAlertDisplayed());
        softAssert.assertTrue(isErrorMessagePresent());
        softAssert.assertAll();

    }

    public boolean isErrorMessagePresent() {
        return isElementPresent(By.cssSelector(".login_login__3EHKB>div"));
    }


}
