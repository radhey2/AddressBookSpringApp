package com.example.addressbookapp.dto;

import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public @ToString class AddressBookDTO {

  //  @Pattern(regexp = "\\b([A-ZÀ-ÿ][-,a-z. ']+[ ]*)",message = "Invalid Firstname")
    @NotEmpty(message = "firstname Should not be Empty")
    public String firstname;

    @NotEmpty(message = "lastname should not be Empty")
    public String lastname;
    @NotEmpty(message = "city Should not be Empty")
    public String city;
  //  @Pattern(regexp = "/^[a-zA-Z0-9.! #$%&'*+/=?]")
    @NotEmpty(message = "Email Should not be Empty")
    public String Email;
    @NotEmpty(message = "Address Should not be Empty")
    public String Address;
    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$")
    @NotNull(message = "phoneNo Should not be Empty")
    public String phoneNo;
    @NotEmpty(message = "state Should not be Empty")
    public String state;

    @NotNull(message = "Zipcode Should Not be Empty")
    public long zipcode;
public AddressBookDTO(String firstname,String lastname,String city,
                      String address,String email,String state,String phoneNo,long zipcode){
    this.firstname = firstname;
    this.lastname = lastname;
    this.city = city;
    this.Address = address;
    this.Email = email;
    this.phoneNo = phoneNo;
    this.state = state;
    this.zipcode = zipcode;
}
   @Override
    public String toString(){
    return "firstname"+firstname+":lastname="+lastname;
   }

}
