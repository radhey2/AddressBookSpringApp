package com.example.addressbookapp.service;

import com.example.addressbookapp.Repository.AddressBookRepository;
import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.exception.AddressBookException;
import com.example.addressbookapp.modal.AddressBookData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AddressBookService implements IAddressBookService{

    @Autowired
    private AddressBookRepository addresssBookRepository;

    @Override
    public AddressBookRepository getAddressBookData(){

        return addresssBookRepository;
    }

    @Override
    public AddressBookData getAddressBookDataById(int Id) {
      return addresssBookRepository.findById(Id).orElseThrow(()->new AddressBookException("Contact with Id" +Id +"Does not Exist..!!"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDTO);
        log.debug("addressBookdata"+addressBookData.toString());
        return addresssBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int Id, AddressBookDTO addressBookDTO) {
       AddressBookData addressBookData = this.getAddressBookDataById(Id);
       addressBookData.updateAddressBookData(addressBookDTO);
       return addresssBookRepository.save(addressBookData);
    }

    @Override
    public void deleteAddressBookData(int Id) {
        AddressBookData addressBookData = this.getAddressBookDataById(Id);
        addresssBookRepository.delete(addressBookData);

    }


}
