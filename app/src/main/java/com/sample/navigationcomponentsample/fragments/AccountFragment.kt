package com.sample.navigationcomponentsample.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.sample.navigationcomponentsample.R
import kotlinx.android.synthetic.main.fragment_account.*

class AccountFragment : Fragment(R.layout.fragment_account) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_launch_profile.setOnClickListener {

            val username = et_username.text.toString()

            val action = AccountFragmentDirections.actionMenuAccountToProfileFragment(username)

            val options = navOptions {
                anim {
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
                popUpTo = R.id.menu_home
            }

            findNavController().navigate(action, options)
        }
    }
}