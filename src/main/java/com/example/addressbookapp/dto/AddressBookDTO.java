package com.example.addressbookapp.dto;

public class AddressBookDTO {
    public String firstname;
    public String lastname;
public AddressBookDTO(String firstname,String lastname){
    this.firstname = firstname;
    this.lastname = lastname;
}
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }
}
