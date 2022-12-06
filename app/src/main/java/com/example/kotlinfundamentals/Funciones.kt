package com.example.kotlinfundamentals

fun main(){
    sayHello()
    newTopic("Argumentos")
    var a = 2
    var b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")

}

private fun sayHello() {
    println("Hola Kotlin")
}

fun sum(a:Int, b:Int): Int{

    return a + b
}

fun sub(a:Int, b:Int) = a - b
