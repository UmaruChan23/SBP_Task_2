package com.example.sbp_task_2.entity

import javax.persistence.*

@Entity
@Table(name = "numbers")
data class PhoneNumber(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(name = "name", insertable = false, updatable = false)
    val name: String,

    val number: String,

    @ManyToOne(fetch = FetchType.LAZY)
    private val contact: Contact
)