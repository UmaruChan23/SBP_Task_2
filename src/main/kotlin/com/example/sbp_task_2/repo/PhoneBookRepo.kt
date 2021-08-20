package com.example.sbp_task_2.repo

import com.example.sbp_task_2.entity.Contact
import org.springframework.data.jpa.repository.JpaRepository

interface PhoneBookRepo: JpaRepository<Contact, Int>{
    fun findByName(name: String): Contact?
}