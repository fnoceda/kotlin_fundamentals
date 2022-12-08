package com.example.kotlinfundamentals

fun main(){
    newTopic("Clases")
    val phone: Phone=Phone(123)
    phone.call()
    phone.showNumber()
    println(phone.number)
}