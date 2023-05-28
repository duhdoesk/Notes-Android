package com.duhdoesk.notes.data

class NotesDataSource() {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(
                title = "Trash",
                body = "Dump the trash into the dumpster"
            ),

            Note(
                title = "Studying",
                body = "Study Android development"
            ),

            Note(
                title = "Post Graduation",
                body = "Read first block of the fifth module"
            ),

            Note(
                title = "Sports",
                body = "Watch Corinthians game agains Fluminense"
            ),

            Note(
                title = "Music",
                body = "Listen to Mac Miller, Tupac, 50 Cent, AFI, Less Than Jake, Scorpions and others"
            ),
        )
    }
}