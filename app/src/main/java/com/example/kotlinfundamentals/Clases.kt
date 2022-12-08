package com.example.kotlinfundamentals

fun main(){
    newTopic("Clases")
    val phone: Phone=Phone(123)
    phone.call()
    phone.showNumber()
//    println(phone.number)

    newTopic("Herencia")
    val smartphone = Smartphone(456, true)
    smartphone.call()
    smartphone.showNumber()
    println("Es Privado => ${smartphone.isPrivate}")
}