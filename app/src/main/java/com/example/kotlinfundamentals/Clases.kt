package com.example.kotlinfundamentals

fun main(){
    /*
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
    */
    newTopic("Data Classes")
    val myUser = User(0, "Juan",  "Perez",  Group.FAMILY, Group.FAMILY.ordinal)
    println(myUser)
    println(myUser.component3())

    val bro = myUser.copy( id =1,  name ="Luis")
    println(bro)

    val friend = bro.copy( id =1,  name ="Roberto", lastName = "Ruiz", group = Group.FRIENDS)
    println(friend)

}