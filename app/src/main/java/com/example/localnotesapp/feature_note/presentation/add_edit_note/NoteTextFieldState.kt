package com.example.localnotesapp.feature_note.presentation.add_edit_note

data class NoteTextFieldState(
    val text : String = "",
    val hintText : String = "",
    val isHintVisible : Boolean = true
)
