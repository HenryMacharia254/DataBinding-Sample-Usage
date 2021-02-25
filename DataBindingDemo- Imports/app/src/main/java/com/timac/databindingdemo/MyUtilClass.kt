package com.timac.databindingdemo

// To show dataBinding import types can be used when referencing static fields and methods in expressions

object MyUtilClass {

    @JvmStatic      // To make the function static
    fun changeText(text: String): String{
        return text
    }
}