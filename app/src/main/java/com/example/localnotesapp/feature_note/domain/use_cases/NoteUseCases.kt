package com.example.localnotesapp.feature_note.domain.use_cases

data class NoteUseCases(
    val addNote : AddNote,
    val getNote : GetNote,
    val getNotes: GetNotes,
    val deleteNote: DeleteNote
)
