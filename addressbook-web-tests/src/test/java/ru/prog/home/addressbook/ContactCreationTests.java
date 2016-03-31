package ru.prog.home.addressbook;


import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    



    
    @Test
    public void testContactCreation() {
        wd.get("http://localhost/addressbook/");

        gotoAddContactPage();
        fillContactForm(new ContactData("Ivanov", "Ivan", "Ivanovich", "Ivan", "Ivancompany", "Ivanovka", "9152477412"));
        submitContactCreation();
    }


}
