package com.example.horoscapp.ui.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.horoscapp.databinding.FragmentHoroscopeBinding

class HoroscopeFragment : Fragment() {

    private var _binding: FragmentHoroscopeBinding? = null  // barra baja _ se pone para señalar que es una variable privada
    private val binding get() = _binding!!   // El binding es poquito distinto en los Fragments que en las Activities

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}