package com.example.addressbookapp.controlller;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.dto.ResponseDTO;
import com.example.addressbookapp.modal.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AddressBook")
public class AddressBookController {
    @RequestMapping(value = {"","/","/home"})
    public ResponseEntity<String> getAddressBookData(){
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get{Id}")
    public ResponseEntity<ResponseDTO>getAddressBookData(@PathVariable("Id") int Id){
        AddressBookData addressBookData;
        addressBookData = new AddressBookData(new AddressBookDTO("Ram","Sharma"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success For Id ",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO>addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created AddressBook Data Successfully",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO>updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated AddressBook Data SuccessFully",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDTO>deleteAddressBookData(@PathVariable ("Id") int Id){
        ResponseDTO responseDTO = new ResponseDTO("Deleted SuccesFully",+Id);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

}


