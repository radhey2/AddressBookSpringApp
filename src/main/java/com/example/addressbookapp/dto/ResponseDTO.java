package com.example.addressbookapp.dto;

import com.example.addressbookapp.modal.AddressBookData;

import java.util.List;

public class ResponseDTO {
    public String message;
    public Object data;

    public ResponseDTO(String message,Object data) {
        this.message = message;
        this.data = data;

    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }
}
