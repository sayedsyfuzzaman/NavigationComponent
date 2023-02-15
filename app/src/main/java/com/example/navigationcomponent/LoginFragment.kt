package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentFirstBinding
import com.example.navigationcomponent.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding:FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.signupTextView.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigate_to_signup_fragment)
        }

        binding.loginButton.setOnClickListener {
            val args = Bundle().apply {
                putString("email", binding.emailEditText.text.toString())
                putString("password", binding.passwordEditText.text.toString())
            }
            Navigation.findNavController(view).navigate(R.id.navigate_to_home, args)
        }
    }
}