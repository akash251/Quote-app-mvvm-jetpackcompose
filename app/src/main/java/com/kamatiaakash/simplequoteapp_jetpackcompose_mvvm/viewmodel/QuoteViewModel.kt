package com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.models.QuoteModel
import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.repository.QuoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class QuoteViewModel @Inject constructor(private val quoteRepository: QuoteRepository):ViewModel() {

    private val _state = MutableStateFlow(emptyList<QuoteModel>())
    val state:StateFlow<List<QuoteModel>>
    get() = _state


    init {
        viewModelScope.launch {
            val quotes = quoteRepository.getListOfQuote()
            _state.value = quotes
        }
    }
}