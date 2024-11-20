/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.claireyaoice4.Contact;
import com.mycompany.claireyaoice4.ContactManager;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author clair
 */
public class testContactManager {
    private ContactManager contactManager;
    
    
    public testContactManager() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        contactManager = new ContactManager();
        Contact contact = new Contact("claire", "yao", "yaocl@sheridancollege.ca");
        Contact contact2 = new Contact("ABC", "yao", "ABC@sheridancollege.ca");
        Contact contact3 = new Contact("ABC", "yao", "yaocl@sheridancollege.ca");
        contactManager.addContact(contact);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
    }
    
    @AfterEach
    public void tearDown() {
        contactManager.clearContacts();
    }

    // find email address in contact list
    @Test
    public void testFindContact_Good(){
        System.out.println("findContact");
        String emailAddress = "yaocl@sheridancollege.ca";
        boolean expResult = true;
        boolean result = contactManager.findContact(emailAddress) !=null;
        assertEquals(expResult, result);
    }
    
    //test does not find email inside contact list
    @Test
    public void testFindContact_Bad(){
        System.out.println("findContact");
        String emailAddress = "y@sheridancollege.ca";
        boolean expResult = false;
        boolean result = contactManager.findContact(emailAddress)!=null;
        assertEquals(expResult, result);
    }
    
    // test see if include null
    @Test
    public void testFindContact_Null(){
        System.out.println("findContact");
        String emailAddress = null;
        boolean expResult = false;
        boolean result = contactManager.findContact(emailAddress)!=null;
        assertEquals(expResult, result);
    }
    
    // test sees if the list if empty
    @Test
    public void testFindContact_EmptyList(){
        System.out.println("testEmpty");
        contactManager.clearContacts();
        boolean expResult = true;
        boolean result = contactManager.listLength()==0;
        assertEquals(expResult, result);
    }
    
    // test email is case sensitive (found in list)
    @Test
    public void testFindContactCS_Good(){
        System.out.println("findContact");
        String emailAddress = "ABC@sheridancollege.ca";
        boolean expResult = true;
        boolean result = contactManager.findContact(emailAddress) !=null;
        assertEquals(expResult, result);
    }
    
    // test email case sensitive (not found)
    @Test
    public void testFindContactCS_Bad(){
        System.out.println("findContact");
        String emailAddress = "abc@sheridancollege.ca";
        boolean expResult = false;
        boolean result = contactManager.findContact(emailAddress) !=null;
        assertEquals(expResult, result);
    }
    
    // test if multiple of same email address
    @Test
    public void testFindContact_MultiGood(){
        System.out.println("findContact");
        String emailAddress = "yaocl@sheridancollege.ca";
        boolean expResult = true;
        boolean result = contactManager.findContact(emailAddress) !=null;
        assertEquals(expResult, result);
    }
    
    //good + bad, yes in list, no not in list
    //boundary search for first and last contact
    //set list to null
    //leave list as is
    //set a contact to null, search for another (ex. 3rd)
    //set contact to null, search for null
    
    //assertNull() functions
    
    //tested git repo by adding something
}   
