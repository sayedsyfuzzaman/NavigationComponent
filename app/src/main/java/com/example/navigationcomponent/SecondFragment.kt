package com.example.navigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentFirstBinding
import com.example.navigationcomponent.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root

        var title = arguments?.getString("myTitle")
        Log.i("addff", title.toString())

        binding.thankYouTextView.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.navigateToFirst)
        }

        return view
    }

}