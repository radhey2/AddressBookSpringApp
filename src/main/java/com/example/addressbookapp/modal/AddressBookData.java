package com.example.addressbookapp.modal;

import com.example.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address_book_data")
public @Data class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Contact_id")
    private int id;

   @Column(name = "Firstname")
    private String firstname;
    private String lastname;
    private String city;
    private String Email;
    private String Address;
    private String phoneNo;
    private String state;

    private long zipcode;

    public AddressBookData() {

    }
    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
        this.firstname = addressBookDTO.firstname;
        this.lastname = addressBookDTO.lastname;
        this.city = addressBookDTO.city;
        this.Address = addressBookDTO.Address;
        this.Email = addressBookDTO.Email;
        this.state = addressBookDTO.state;
        this.phoneNo = addressBookDTO.phoneNo;
        this.zipcode = addressBookDTO.zipcode;
    }

    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.updateAddressBookData(addressBookDTO);
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


}
