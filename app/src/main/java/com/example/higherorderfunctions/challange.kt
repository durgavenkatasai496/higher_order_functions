package com.example.higherorderfunctions

fun main(){
   var c = challenge(one = 4, two = 5){ one,two -> one + two }
    println(c)

    var product = challenge(one = 4, two = 5){ one , two -> one * two }
    println(product)
}

fun challenge(one : Int, two : Int , operation : (Int, Int) -> Int) : Int{


    var operation = operation(one,two)

    return operation

}