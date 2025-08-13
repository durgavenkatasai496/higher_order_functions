package com.example.higherorderfunctions.invoke


fun main(){


    var add : (Int, Int) -> Int = { a , b -> a + b}

    //Unit Nothing
    var result1 = add(1,2)
    println(result1)

    //Using Invoke()
    var result2 = add.invoke(1,2)
    println(result2)

}

