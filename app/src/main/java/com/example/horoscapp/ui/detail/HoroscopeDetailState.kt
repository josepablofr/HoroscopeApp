package com.example.horoscapp.ui.detail

sealed class HoroscopeDetailState {
    data object Loading: HoroscopeDetailState()
    data class Error(val error:String): HoroscopeDetailState() // es data class cuando se pasa parámetro
    data class Success(val data:String): HoroscopeDetailState()
}