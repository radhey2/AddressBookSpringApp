package com.example.addressbookapp.modal;

import com.example.addressbookapp.dto.AddressBookDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class AddressBookData {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String firstname;
    private String lastname;

    public AddressBookData(int i, AddressBookDTO addressBookDTO) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.firstname = addressBookDTO.firstname;
        this.lastname = addressBookDTO.lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public AddressBookData(){

    }
}