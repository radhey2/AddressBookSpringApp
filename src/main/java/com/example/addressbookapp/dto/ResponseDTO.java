package com.example.addressbookapp.dto;

import com.example.addressbookapp.modal.AddressBookData;
import lombok.Data;

import java.util.List;

public @Data class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;

    }

}
