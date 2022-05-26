package com.example.addressbookapp.Repository;

import com.example.addressbookapp.modal.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {
}
