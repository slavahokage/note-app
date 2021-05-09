package com.bersyte.noteapp.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bersyte.noteapp.repository.NoteRepository

class NoteViewModelProviderFactory(
    private val noteRepository: NoteRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        Log.d("KKKK","Create")
        return NoteViewModel(noteRepository) as T
    }
}