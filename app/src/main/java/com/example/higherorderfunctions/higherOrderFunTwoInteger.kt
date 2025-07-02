package com.example.higherorderfunctions


fun higherOrderFunTwoInteger(a : Int, b : Int, operation : (Int, Int) -> Int){

    var operation = operation(a,b)
    print(operation)

}