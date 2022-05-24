package com.example.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;

public class AddressBookDTO {

    @NotEmpty(message = "firstname Should not be Empty")
    public String firstname;

    @NotEmpty(message = "lastname should not be Empty")
    public String lastname;
public AddressBookDTO(String firstname,String lastname){
    this.firstname = firstname;
    this.lastname = lastname;
}
   @Override
    public String toString(){
    return "firstname"+firstname+":lastname="+lastname;
   }

}
