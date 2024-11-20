/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claireyaoice4;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author clair
 */
public class ContactManager {
    private List<Contact> contactList = new ArrayList<>();

    /*
	Locate a Contact record that matches the email address provided.
	Returns the Contact record if found, null if not found.
    */
    public Contact findContact(String emailAddress){
        if (emailAddress == null){
            return null;}
        
        for (Contact x : contactList){
            if (x.getEmailAddress().equals(emailAddress) ){
                return x;
            }
        }
        return null;
    }

    /*
	 Removes all contacts
    */
    public void clearContacts(){
        contactList.clear();
    }
    
    public int listLength(){
        return contactList.size();
    }
    
    public void addContact(Contact contact){
        contactList.add(contact);
    }
    
    //random change adding comment
}
