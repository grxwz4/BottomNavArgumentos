package com.example.bottomnavargumentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavargumentos.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {
    private lateinit var binding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInfoBinding.inflate(layoutInflater)

        val thisnombre = arguments?.getString("nombre")
        val thisAnombre = arguments?.getString("apellidop")
        val thisBnombre = arguments?.getString("apellidom")
        val thisusuario = arguments?.getString("usuario")
        val thisemail = arguments?.getString("email")
        binding.nombre.setText(thisnombre)
        binding.nombreA.setText(thisAnombre)
        binding.nombreB.setText(thisBnombre)
        binding.usuario.setText(thisusuario)
        binding.email.setText(thisemail)
        return binding.root


    }

}