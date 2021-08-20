package com.example.sbp_task_2.service

import com.example.sbp_task_2.entity.Contact
import com.example.sbp_task_2.entity.PhoneNumber
import com.example.sbp_task_2.repo.NumbersRepo
import com.example.sbp_task_2.repo.PhoneBookRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PhoneBookService(
    @Autowired private val phoneBookRepo: PhoneBookRepo,
    @Autowired private val numbersRepo: NumbersRepo
) {

    fun findContact(name: String): Contact? {
        return phoneBookRepo.findByName(name)
    }

    fun getAllContacts(filter: String): List<Contact> {
        return phoneBookRepo.findAll()
    }

    fun saveContact(contact: Contact): Int {
        phoneBookRepo.save(contact)
        return contact.id
    }

    fun deleteContact(contact: Contact) {
        phoneBookRepo.delete(contact)
    }

    fun addNumber(phoneNumber: PhoneNumber){

    }

    fun deleteNumber(phoneNumber: PhoneNumber){

    }
}