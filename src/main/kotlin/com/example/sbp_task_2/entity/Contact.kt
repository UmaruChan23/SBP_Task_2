package com.example.sbp_task_2.entity

import javax.persistence.*

@Entity
@Table(name = "contacts")
data class Contact(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    val name: String,

    @OneToMany(mappedBy = "contact", cascade = [CascadeType.ALL])
    val numbers: List<PhoneNumber>?
)