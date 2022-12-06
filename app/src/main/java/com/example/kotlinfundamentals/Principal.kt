package com.example.kotlinfundamentals

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
}

fun newTopic(topic: String ){
    println()
    print("========== ")
    print(topic);
    print(" ==========")
    println()
    print("\n========== $topic ==========")
    println()
}