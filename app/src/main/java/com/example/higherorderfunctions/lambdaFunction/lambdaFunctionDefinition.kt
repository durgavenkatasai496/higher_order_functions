package com.example.higherorderfunctions.lambdaFunction

/*
 * Lambda Function: A lambda is an anonymous function (a function without a name).
 * It can take parameters, perform operations, and return a result.
 * We can pass values to it and get the result.
 */

fun main(){
    lambdaFunction()
}

fun lambdaFunction(){

    var lambdaFunctionResult = {a : Int, b : Int -> a + b}

    print(lambdaFunctionResult(2,5))

}