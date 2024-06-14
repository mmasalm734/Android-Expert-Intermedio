package com.example.horoscopapp.ui.home.luck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.horoscopapp.databinding.FragmentLuckBinding


class LuckFragment : Fragment() {
    private var _binding: FragmentLuckBinding? = null //lleva barra baja porque la definimos como una variable a la que no se debería acceder
    private val binding get() = _binding!! //cuando queremos acceder al _binding tenemos que hacerlo a través de binding sin _

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}