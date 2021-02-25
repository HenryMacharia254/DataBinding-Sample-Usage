package com.timac.databindingdemo

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.timac.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding :ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

/*
        myViewModel.message.observe(this, {
            binding.textView.text = it
        })

    This is one way of doing it by using an observer
    Another way is by doing it in the xml by declaring a viewmodel variable and using it directly.
    Then add the code below to establish a connection between the binding class and the viewmodel

*/
        binding.viewModel= myViewModel
        binding.lifecycleOwner = this

        binding.editText.addTextChangedListener( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(char: CharSequence?, start: Int, before: Int, count: Int) {
                myViewModel.setMessage(char.toString())
            }
            override fun afterTextChanged(s: Editable?) {}

        })


    }
}