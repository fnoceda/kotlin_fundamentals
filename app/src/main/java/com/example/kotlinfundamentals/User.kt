package com.example.kotlinfundamentals

enum class Group{FAMILY, WORK, FRIENDS }
// val es constante
// var se puede cambiar
data class User(val id: Long, var name: String, var lastName: String, var group: Group, var group2: Int) {

}