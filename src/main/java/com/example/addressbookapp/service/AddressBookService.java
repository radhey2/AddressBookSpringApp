package com.example.addressbookapp.service;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.modal.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData>addressBookDataList =new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1,new AddressBookDTO("Ram","Sharma")));
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int Id) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,new AddressBookDTO("ram","Sharma"));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,addressBookDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,addressBookDTO);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int Id) {

    }


}
