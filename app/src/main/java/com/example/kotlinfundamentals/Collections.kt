package com.example.kotlinfundamentals

fun main(){
    newTopic("Colections")
    newTopic("Solo lectura")

    val frutaList = listOf("Manzana", "Banana", "Uva", "Lima")
    //   i = (0..persons.size -1 ).random()
//    println(frutaList.get((0..frutaList.size-1).random()))
//    println(frutaList.get((frutaList.indices).random()))
//    println("Index de Uva es: ${frutaList.indexOf("Uva")}")

    newTopic("Mutable List")
    val myUser = User(0, "Juan",  "Perez",  Group.FAMILY, Group.FAMILY.ordinal)
    val bro = myUser.copy( id =1,  name ="Luis")
    val friend = bro.copy( id =1,  name ="Roberto", lastName = "Ruiz", group = Group.FRIENDS)

    val userList = mutableListOf<User>(myUser,  bro)
    print(userList)
    println()
    userList.add(friend)
    print(userList)
    println()
    userList.removeAt(1)
    print(userList)
    println()
    userList.remove(friend)
    print(userList)
    println()

    val userSelectedList = mutableListOf<User>()
    println(userSelectedList)
    userSelectedList.addAll(userList)
    println(userSelectedList)
    println()
    userSelectedList.set(0, friend) //sobre escribe la posicion 0 con el nuevo objeto provisto
    println(userSelectedList)
    println()

    print(myUser)
    println()

    userSelectedList.add(myUser) // OJO este tipo de listas permiten la duplicacion
    println(userSelectedList)
    println()

    userSelectedList.add(myUser)
    println(userSelectedList)


}