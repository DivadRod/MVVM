package com.example.examplemvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider

class QuoteViewModel : ViewModel() {
    //Permite suscribirnos a los cambios de QuoteModel
    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        //Vamos a revisar si hay cambios
        quoteModel.postValue(currentQuote)
    }

}