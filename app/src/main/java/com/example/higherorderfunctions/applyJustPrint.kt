package com.example.higherorderfunctions

fun <T> applyJustPrint(value : T,operation : (T) -> T){
    val operation = operation(value)
    print(operation)
}