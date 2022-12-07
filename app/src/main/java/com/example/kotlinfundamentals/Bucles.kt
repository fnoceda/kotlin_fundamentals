package com.example.kotlinfundamentals

fun main(){
    newTopic("Bucles")
//    showPerson("Juan", "Maria", "Luis")
    showPersons("Juan", "Maria", "Luis")

}


fun showPerson(p1:String, p2:String, p3:String ){
    println(p1)
    println(p2)
    println(p3)
}

fun showPersons(vararg persons: String ){
    newTopic("For")
    for(person in persons){
        println(person)
    }
    newTopic("While")
    var i = 0
    while(i < persons.size){
        println(persons[i])
        i++
    }
}