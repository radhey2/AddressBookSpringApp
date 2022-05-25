package com.example.addressbookapp.service;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.exception.AddressBookException;
import com.example.addressbookapp.modal.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{

    private List<AddressBookData> addressBookDataList = new ArrayList<>();
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData>addressBookDataList =new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1,new AddressBookDTO("Ram","Sharma")));
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int Id) {
        return addressBookDataList
                .stream().filter(addressBookData -> addressBookData.getId()==Id)
                .findFirst()
                .orElseThrow(()->new AddressBookException("Contact not Found"));
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
