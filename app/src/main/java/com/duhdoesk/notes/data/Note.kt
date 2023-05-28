package com.duhdoesk.notes.data

import java.time.LocalDateTime
import java.util.UUID

data class Note(
    val id: UUID = UUID.randomUUID(), // this creates random and unique IDs to every instance
    val title: String,
    val body: String,
    val entryDate: LocalDateTime = LocalDateTime.now() // this sets the note's creation date
)