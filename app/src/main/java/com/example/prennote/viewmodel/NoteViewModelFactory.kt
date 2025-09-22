package com.example.prennote.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import  com.example.prennote.repository.NoteRepository

class NoteViewModelFactory(val app: Application, private val noteRepository: NoteRepository) {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    fun <T: ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModelFactory(app, noteRepository) as T
    }
}