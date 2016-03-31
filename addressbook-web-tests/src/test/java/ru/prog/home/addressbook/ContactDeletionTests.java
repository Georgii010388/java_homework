package ru.prog.home.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class ContactDeletionTests extends TestBase {


    
    @Test
    public void testContactDeletion() {
        gotoContactPage();
        selectContact();
        deleteSelectedContact();
        confirmContactDeletion();
        gotoContactPage();
    }

}
