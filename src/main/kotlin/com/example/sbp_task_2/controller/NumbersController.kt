package com.example.sbp_task_2.controller

import com.example.sbp_task_2.entity.PhoneNumber
import com.example.sbp_task_2.service.PhoneBookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/numbers")
class NumbersController(@Autowired val service: PhoneBookService) {

    @PostMapping
    fun addNumber(@RequestBody number: PhoneNumber) {

    }

    @DeleteMapping
    fun deleteNumber(@RequestBody number: PhoneNumber) {

    }
}