package com.example.sbp_task_2.repo

import com.example.sbp_task_2.entity.PhoneNumber
import org.springframework.data.jpa.repository.JpaRepository

interface NumbersRepo: JpaRepository<PhoneNumber, Int> {
}