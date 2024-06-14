package com.example.horoscopapp.ui.home.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horoscopapp.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {
    private var _binding: FragmentHoroscopeBinding? = null //lleva barra baja porque la definimos como una variable a la que no se debería acceder
    private val binding get() = _binding!! //cuando queremos acceder al _binding tenemos que hacerlo a través de binding sin _

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}