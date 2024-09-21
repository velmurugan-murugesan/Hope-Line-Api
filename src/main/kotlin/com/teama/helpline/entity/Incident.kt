package com.teama.helpline.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(
    name = "incident"
)
data class Incident(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    @Column(name = "title")
    val title: String = "",

    @Column(name = "description")
    val description: String = "",

    @Column(name = "location")
    val location: String = "",

    @Column(name = "noOfVolunteer")
    val noOfVolunteer: String = "",

    @Column(name = "isHub")
    val isHub: Boolean = false

)