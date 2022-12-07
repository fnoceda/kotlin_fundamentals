package com.example.kotlinfundamentals

const val separator = "========== "

fun main(){
    println("Hola Kotlin");
    newTopic("Variables y Constantes");
    val a = true;
    println("a = $a");

    var b = 2;
    println("b = $b")

    var c: Int;
    c = 5;
    println("c = $c")

    var obNull: String?
    obNull = null



}

fun newTopic(topic: String ){

    print("\n$separator $topic $separator\n")
}