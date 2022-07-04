package com.example.addressbookapp.service;

import com.example.addressbookapp.Repository.AddressBookRepository;
import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.modal.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int Id);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int Id, AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int Id);

    List<AddressBookData> sortAddressBookByCity();
    
    List<AddressBookData> sortAddressBookByState();
}

