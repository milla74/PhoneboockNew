package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteTests extends TestBase{


    @BeforeMethod
    public void precondition(){
       clickOnLoginLink();
        fillRegisterLoginForm(new User().setEmail("manual22@gmail.com").setPassword("Manuel12345$"));
        clickOnLoginButton();

        clickOnAddLink();
        fillContactForm(new Contact()
                .setName("Kristina")
                .setLastName("Tomash")
                .setPhone("01234567890")
                .setEmail("Test1@gm.com")
                .setAddress("Berline")
                .setDescription("QA"));
        clickOnSaveButton();
    }
    @Test
    public void deleteContactTest(){
        int sizeBefore = sizeOfContacts();
        deleteContact();
        pause(1000);
        int sizeAfter = sizeOfContacts();
        Assert.assertEquals(sizeAfter,sizeBefore -1);
        }

}
