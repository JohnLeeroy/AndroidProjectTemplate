package com.example.projecttemplate

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {

    private val _displayText =
        MutableStateFlow<String>("Hello World from MainViewModel")
    val displayTextFlow: StateFlow<String> = _displayText.asStateFlow()

}