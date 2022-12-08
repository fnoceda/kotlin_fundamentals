package com.example.kotlinfundamentals

class Smartphone(number:Int, val isPrivate: Boolean):Phone(number) {

    override fun showNumber() {
        if(isPrivate) println("Numero Privado") else super.showNumber()
    }

}