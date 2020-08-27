package com.sample.navigationcomponentsample.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.sample.navigationcomponentsample.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_goto_account.setOnClickListener {
            findNavController().navigate(R.id.action_menu_home_to_menu_account)
            Navigation.findNavController(view).navigate(R.id.action_menu_home_to_menu_account)
        }

        btn_goto_account.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_menu_home_to_menu_account))
    }
}