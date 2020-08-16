package com.example.firstapp.Fragment.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.firstapp.R
import kotlinx.android.synthetic.main.fragment_contactlist.view.*

class  ListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_contactlist, container, false)

        view.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_contactlistFragment_to_addFragment)
        }
        return view
    }
}