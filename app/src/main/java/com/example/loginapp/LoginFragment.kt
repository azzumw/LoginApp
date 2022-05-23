package com.example.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.database.DatabaseUtilsCompat
import androidx.databinding.DataBindingUtil
import com.example.loginapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentLoginBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)

        binding.loginBtn.setOnClickListener {
            launchSignInFlow()
        }

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun launchSignInFlow() {

    }
}