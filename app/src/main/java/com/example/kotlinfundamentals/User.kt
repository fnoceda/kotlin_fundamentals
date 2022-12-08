package com.example.kotlinfundamentals

enum class Group{FAMILY, WORK, FRIENDS }

data class User(val id: Long, var name: String, var lastName: String, var group: Group, var group2: Int) {

}