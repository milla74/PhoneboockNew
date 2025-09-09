package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTest(){
        //click on Login link
        driver.findElement(By.cssSelector("[href='/login']")).click();
        //enter email
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("manual21@gmail.com");
    }




    //enter password

    //click on Registration button

    //verify Sign Out button is display

}
