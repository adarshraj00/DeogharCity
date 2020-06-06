package com.example.deogharcity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.RenderProcessGoneDetail
import androidx.databinding.DataBindingUtil
import com.example.deogharcity.databinding.FragmentMoreAboutBinding
import kotlinx.android.synthetic.main.fragment_more_about.*


class more_about : Fragment() {
    private lateinit var binding:FragmentMoreAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater,
            R.layout.fragment_more_about,container,false)
        binding.scrollview2.visibility=View.GONE
        binding.button2.setOnClickListener{
            binding.scrollview2.visibility=View.VISIBLE
            binding.scrollview1.visibility=View.GONE
        }
        return binding.root
    }


}