package com.example.dsm_appcliente.model

data class Product(
    val id: Long = 0,
    val name: String = "",
    val nameStore: String = "",
    val price: Double = 0.0,
    val photoUrl: String = "",
    val description: String = "",
    val specifications: Map<String, String>
)