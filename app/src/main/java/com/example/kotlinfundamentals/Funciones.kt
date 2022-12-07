package com.example.kotlinfundamentals

import kotlin.math.abs

fun main(){
    sayHello()
//    newTopic("Argumentos")
//    var a = 2
//    var b = 3
//    println("$a + $b = ${sum(a,b)}")
//    println("$a - $b = ${sub(a,b)}")
//    newTopic("Infix")
//    val c = -3
//    println(c.enableAbs(false))
    newTopic("Sobre Carga")
    showProduct("Soda", "10%")
    showProduct("Pan", validity = "el viernes")

}
private fun sayHello() { println("Hola Kotlin") }
fun sum(a:Int, b:Int): Int{ return a + b }
fun sub(a:Int, b:Int) = a - b
infix fun Int.enableAbs(enable: Boolean) = if(enable) abs(this) else this

fun showProduct(name: String, promo: String = "Sin Promo", validity: String = "Agotar existencias") {
    println("$name = $promo hasta $validity")
}

