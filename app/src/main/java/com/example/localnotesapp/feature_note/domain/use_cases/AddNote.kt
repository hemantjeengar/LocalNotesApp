package com.example.localnotesapp.feature_note.domain.use_cases

import com.example.localnotesapp.feature_note.domain.model.InvalidNoteException
import com.example.localnotesapp.feature_note.domain.model.Note
import com.example.localnotesapp.feature_note.domain.repository.NoteRepository
import javax.inject.Inject
import kotlin.jvm.Throws

class AddNote @Inject constructor(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note : Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty")
        }
        repository.insertNote(note)
    }
}