package com.example.addressbookapp.Repository;

import com.example.addressbookapp.modal.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {
    @Query(value = "select *from  address_book_data order by city asc", nativeQuery = true)
    List<AddressBookData> sortByCity();
    @Query(value = "select *from  address_book_data order by state asc", nativeQuery = true)
    List<AddressBookData> sortByState();

}
