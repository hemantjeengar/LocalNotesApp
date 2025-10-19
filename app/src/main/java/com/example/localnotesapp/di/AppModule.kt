package com.example.localnotesapp.di

import android.app.Application
import androidx.room.Room
import com.example.localnotesapp.feature_note.data.data_source.NoteDatabase
import com.example.localnotesapp.feature_note.data.repository.NoteRepositoryImpl
import com.example.localnotesapp.feature_note.domain.repository.NoteRepository
import com.example.localnotesapp.feature_note.domain.use_cases.AddNote
import com.example.localnotesapp.feature_note.domain.use_cases.DeleteNote
import com.example.localnotesapp.feature_note.domain.use_cases.GetNote
import com.example.localnotesapp.feature_note.domain.use_cases.GetNotes
import com.example.localnotesapp.feature_note.domain.use_cases.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNotesDatabase(app : Application) : NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNotesRepository(database: NoteDatabase) : NoteRepository {
        return NoteRepositoryImpl(database.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository) : NoteUseCases {
        return NoteUseCases(
            addNote = AddNote(repository),
            getNote = GetNote(repository),
            getNotes = GetNotes(repository),
            deleteNote  = DeleteNote(repository)
        )
    }
}