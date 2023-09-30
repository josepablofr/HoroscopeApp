package com.example.horoscapp.ui.detail

import com.example.horoscapp.domain.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading: HoroscopeDetailState()
    data class Error(val error:String): HoroscopeDetailState() // es data class cuando se pasa parámetro
    data class Success(val prediction:String, val sign:String, val horoscopeModel: HoroscopeModel): HoroscopeDetailState()
}