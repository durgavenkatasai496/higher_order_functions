package com.example.higherorderfunctions


/*
 * Higher-Order Functions:
 * A Higher-Order Function is a function that either:
 * 👉 Takes another function as a parameter
 * 👉 Returns a function as its result
 */




fun main(){

    higherOrderFunTwoInteger(a = 5,b = 5) { a,b -> a * b }

    applyJustPrint(value = 5, operation = {it * 5})


}