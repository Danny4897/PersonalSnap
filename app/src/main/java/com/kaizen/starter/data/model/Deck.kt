package com.kaizen.starter.data.model

data class Deck(
    val id: Int,
    val name: String,
    val cards: List<Card>
)