package com.jaholm;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    //store (sjekke om navnet er i bruk)
    public boolean addNewContacts(Contacts contact){
        if (searchContacts(contact.getName()) >=0){
            System.out.println("Contact with similar name already in system");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    //query contact names

    private int searchContacts(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    private int searchContacts(String contactName){
        for (int i=0; i<this.myContacts.size(); i++){
            Contacts contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContacts(Contacts contact) {
        if (searchContacts(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContacts(String name) {
        int position = searchContacts(name);
        if (position>=0){
            return this.myContacts.get(position);
        } else {
            return null;
        }

    }

    //modify (sjekke om navnet er i bruk)
    public boolean modifyContacts(Contacts oldContact, Contacts newContact){
        int foundPosition = searchContacts(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    //remove

    public boolean removeContacts(Contacts oldContact){
        int foundPosition = searchContacts(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName() + ", was not found and not removed.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(oldContact.getName() + " was removed.");
        return true;
    }

    //print

    public void printContacts() {
        System.out.println("Contact List");
        for (int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1)+". " +
            this.myContacts.get(i).getName() + " -> " +
            this.myContacts.get(i).getPhoneNumber());
        }
    }


}
