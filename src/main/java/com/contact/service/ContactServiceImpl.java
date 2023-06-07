package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "amit@gmail.com", "Amit", 121L),
            new Contact(2L, "sumit@gmail.com", "Sumit", 122L),
            new Contact(3L, "namit@gmail.com", "Namit", 123L),
            new Contact(4L, "lalit@gmail.com", "Lalit", 124L)
            );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
