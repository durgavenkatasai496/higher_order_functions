package com.example.higherorderfunctions


/*
 * Higher-Order Functions:
 * A Higher-Order Function is a function that either:
 * 👉 Takes another function as a parameter
 * 👉 Returns a function as its result
 */


fun higherOrderFunExample(a : Int, b : Int, operation : (Int, Int) -> Int){

    var operation = operation(a,b)
    print(operation)

}

fun main(){

    higherOrderFunExample(a = 5,b = 5) { a,b -> a * b }

}