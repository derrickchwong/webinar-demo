package com.example.webinardemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping("/contacts")
    public List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    @GetMapping("/contact/{id}")
    public Contact getContactById(@PathVariable("id") Long id){
        return contactRepository.getOne(id);
    }

    @PostMapping("/contact")
    public Contact createContact(@RequestBody Contact contact){
        return contactRepository.save(contact);
    }
}
