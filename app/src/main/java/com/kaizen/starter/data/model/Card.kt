package com.kaizen.starter.data.model

data class Card(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val cost: Int,
    val power: Int,
    val abilities: List<String> = emptyList() // Optional: List of card abilities
)