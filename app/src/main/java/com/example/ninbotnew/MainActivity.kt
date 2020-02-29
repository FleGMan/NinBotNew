package com.example.ninbotnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainTextView.text="NinBot rises again !"
        mainTextView.setOnClickListener {
            val action = SalesListFragmentDirections.actionSalesListFragmentToAdminFragment();
            fragment.findNavController().navigate(action)
        }
    }
}
