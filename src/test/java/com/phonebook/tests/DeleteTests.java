package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteTests extends TestBase{

    //login
    //add contact
    @BeforeMethod
    public void precondition(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "manual22@gmail.com");
        type(By.name("password"), "Manuel12345$");
        click(By.name("login"));

        click(By.cssSelector("[href='/add']"));
        type(By.cssSelector("input:nth-child(1)"),"Kristina");
        type(By.cssSelector("input:nth-child(2)"),"Tomash");
        type(By.cssSelector("input:nth-child(3)"),"01234567890");
        type(By.cssSelector("input:nth-child(4)"),"Test1@gm.com");
        type(By.cssSelector("input:nth-child(5)"),"Berline");
        type(By.cssSelector("input:nth-child(6)"),"QA");
        click(By.cssSelector(".add_main__1tbl_ button"));
    }
    @Test
    public void deleteContactTest(){
        //click on the card
        driver.findElement(By.cssSelector(".contact-item_card__2SOIM")).click();
        //click on Remove button
        driver.findElement(By.xpath("//button[.='Remove']")).click();
        }

    }

    //verify contact is deleted


}
