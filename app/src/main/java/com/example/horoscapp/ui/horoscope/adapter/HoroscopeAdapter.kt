package com.example.horoscapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscapp.R
import com.example.horoscapp.domain.model.HoroscopeInfo

class HoroscopeAdapter(private var horoscopeList:List<HoroscopeInfo> = emptyList(),
    private val onItemSelected: (HoroscopeInfo) -> Unit) :
    RecyclerView.Adapter<HoroscopeViewHolder>() {

    fun updateList(list: List<HoroscopeInfo>){
        horoscopeList = list
        notifyDataSetChanged() // nos mandó un warning xq no es eficiente (cuando incertas 1 ó 2 datos pero como pasamos de nada a algo, está bien
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope, parent, false)
        )
    }

    override fun getItemCount()= horoscopeList.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        holder.render(horoscopeList[position], onItemSelected)
    }
}

// En los Recyclers View ya tenemos el contexto, nunca se deben pasar por parámetro