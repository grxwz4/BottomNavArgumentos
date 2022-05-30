package com.example.bottomnavargumentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.navigation.fragment.findNavController
import com.example.bottomnavargumentos.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        val navController = findNavController()

        binding.boton.setOnClickListener{
            val tname = binding.inputName.text.toString()
            val tpname = binding.inputAname.text.toString()
            val tmname = binding.inputBname.text.toString()
            val tuser = binding.inputUser.text.toString()
            val temail = binding.inputEmail.text.toString()
            val directions = HomeFragmentDirections.actionHomeFragmentToInfoFragment(tname, tpname, tmname, tuser, temail)
            navController.navigate(directions)
        }

        return binding.root
    }

}