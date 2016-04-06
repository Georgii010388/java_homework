package ru.prog.home.addressbook.tests;

import org.testng.annotations.Test;


public class ContactDeletionTests extends TestBase {


    
    @Test
    public void testContactDeletion() {
        app.gotoContactPage();
        app.selectContact();
        app.deleteSelectedContact();
        app.confirmContactDeletion();
        app.gotoContactPage();
    }

}
