package com.example.kotlinfundamentals

open class Phone(protected val number: Int) {


fun call() =  println("llamando!")

open fun showNumber() = println("Mi numero es: $number")

}