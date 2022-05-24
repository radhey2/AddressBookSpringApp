package com.example.addressbookapp.dto;

import com.example.addressbookapp.modal.AddressBookData;

public class ResponseDTO {
    public ResponseDTO(String get_call_success, AddressBookData adData) {
    }

    public ResponseDTO(String deleted_succesFully, int i) {
    }

    public String firstname;
    public String lastname;

    public ResponseDTO(String firstname,String lastname){

        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
