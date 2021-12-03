package com.example.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.model.QuoteModel
import com.example.examplemvvm.model.QuoteProvider

class QuoteViewModel : ViewModel() {
    //Permite suscribirnos a los cambios de QuoteModel
    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        //Vamos a revisar si hay cambios
        quoteModel.postValue(currentQuote)
    }

}