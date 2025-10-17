package com.example.localnotesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.localnotesapp.ui.theme.BabyBlue
import com.example.localnotesapp.ui.theme.LightGreen
import com.example.localnotesapp.ui.theme.RedOrange
import com.example.localnotesapp.ui.theme.RedPink
import com.example.localnotesapp.ui.theme.Violet

@Entity
data class Note(
    val title : String,
    val content : String,
    val timestamp : Long,
    val color : Int,
    @PrimaryKey val id : Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message : String) : Exception(message)
