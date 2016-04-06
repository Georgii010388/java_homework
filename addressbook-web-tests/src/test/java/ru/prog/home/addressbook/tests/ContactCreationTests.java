package ru.prog.home.addressbook.tests;


import org.testng.annotations.Test;
import ru.prog.home.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    



    
    @Test
    public void testContactCreation() {
      //  app.wd.get("http://localhost/addressbook/");

        app.gotoAddContactPage();
        app.fillContactForm(new ContactData("Ivanov", "Ivan", "Ivanovich", "Ivan", "Ivancompany", "Ivanovka", "9152477412"));
        app.submitContactCreation();
    }


}
