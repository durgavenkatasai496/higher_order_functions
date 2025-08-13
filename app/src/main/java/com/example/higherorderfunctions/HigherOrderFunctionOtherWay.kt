package com.example.higherorderfunctions

/*
 *
 *
 *
 */

fun main(){
    val double = multiplier(2)
    print(double(5))
}

fun multiplier(factor : Int) : (Int) -> Int{
    return {number -> number * factor}
}