package com.example.localnotesapp.feature_note.domain.use_cases

import com.example.localnotesapp.feature_note.domain.model.Note
import com.example.localnotesapp.feature_note.domain.repository.NoteRepository

class DeleteNote (
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note : Note) {
        repository.deleteNote(note)
    }

}