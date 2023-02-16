package com.example.navigationcomponent

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.ActivityHomeBinding
import com.example.navigationcomponent.databinding.FragmentHomeBinding
import com.example.navigationcomponent.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
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
            //Go to another activity from this fragment
            val intent = Intent(requireContext(), HomeActivity::class.java)
            var email = binding.emailEditText.text.toString()
            var name = "Name"

            if (email == "sayedsyfuzzaman@gmail.com"){
                name = "Syfuzzaman"
            }
            intent.putExtra("name", name)
            requireActivity().startActivity(intent)
        }
    }
}