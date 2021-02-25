package com.timac.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.timac.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding :ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        /*
        We can access variables that are created in the linked layout such as:
            binding.user        -> For variable named user
        * */

        val myUser = User("John", "Doe", 25, true)
        binding.user = myUser

    }
}