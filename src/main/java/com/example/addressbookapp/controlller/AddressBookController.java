package com.example.addressbookapp.controlller;

import com.example.addressbookapp.Repository.AddressBookRepository;
import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.dto.ResponseDTO;
import com.example.addressbookapp.modal.AddressBookData;
import com.example.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
@RequestMapping("/AddressBook")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;
    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBookData(){
        List<AddressBookData> addressBookData = null;
        addressBookData = addressBookService.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("Get Call For Success",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<ResponseDTO>getAddressBookData(@PathVariable("Id") int Id){
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.getAddressBookDataById(Id);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success For Id ",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/get/sortbycity")
    public ResponseEntity<ResponseDTO> sortByCity() {
        List<AddressBookData> addressBookList = null ;
        addressBookList = addressBookService.sortAddressBookByCity();
        ResponseDTO responseDTO = new ResponseDTO("Sort by city call is successful! ", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    //   To get state in ascending order
    @GetMapping("/get/sortbystate")
    public ResponseEntity<ResponseDTO> sortByState() {
        List<AddressBookData> addressBookList = null;
        addressBookList = addressBookService.sortAddressBookByState();
        ResponseDTO responseDTO = new ResponseDTO("Sort by state call is successful! ", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO>addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created AddressBook Data Successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update/{Id}")
    public ResponseEntity<ResponseDTO>updateAddressBookData(@PathVariable int Id,@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.updateAddressBookData(Id,addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated AddressBook Data SuccessFully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<ResponseDTO>deleteAddressBookData(@PathVariable ("Id") int Id){
        addressBookService.deleteAddressBookData(Id);
        ResponseDTO responseDTO = new ResponseDTO("Deleted SuccesFully",+Id);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

}


