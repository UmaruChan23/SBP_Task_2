package com.example.sbp_task_2.controller

import com.example.sbp_task_2.entity.Contact
import com.example.sbp_task_2.entity.PhoneNumber
import com.example.sbp_task_2.service.PhoneBookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/contacts")
class PhoneBookController(
    @Autowired
    val service: PhoneBookService
) {

    @GetMapping("/all")
    fun getAllContacts(@RequestParam filter: String): List<Contact> {
        return service.getAllContacts(filter)
    }

    @GetMapping
    fun getContact(@RequestParam name: String): Contact? {
        return service.findContact(name)
    }

    @PostMapping
    fun addContact(@RequestBody contact: Contact): Int {
       return service.saveContact(contact)
    }

    @PutMapping
    fun editContact(@RequestBody contact: Contact) {
        service.saveContact(contact)
    }

    @DeleteMapping
    fun deleteContact(contact: Contact) {
        service.deleteContact(contact)
    }

}