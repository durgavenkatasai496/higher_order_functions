package com.example.higherorderfunctions



fun main(){

    //Unit
    doPrint(x = 2, y = 3, operation = {x,y ->
       println(x * y)
   })

    //Int
   var output =  calculate(x = 2, y = 3, operation = {x,y -> x + y})
    println(output)

    //Boolean value :
    var booleanValue = checkNumber(value = 2 , operation = {value -> value % 2 == 1})
    print(booleanValue)

    //String
    var formatString = greetUser(name = "Durga", formatter = {name -> "Hello $name"})
    print(formatString)
}

/*
🔹 1. Function with Unit Return Type (No return value)
 *
 */
fun doPrint(x : Int, y : Int, operation:(Int, Int ) -> Unit){
    operation(x,y)
}


/*
 *
 * 2.Function with Int Return Type :
 *
 */
fun calculate(x : Int, y : Int , operation: (Int, Int) -> Int) : Int{
    return operation(x,y)
}

/*
 *
 * Function With Boolean Return Type :
 */

fun checkNumber(value : Int, operation : (Int) -> Boolean) : Boolean{
    return operation(value)
}

/*
 * 🔹 4. Function with String Return Type
 *
 */

fun greetUser(name : String, formatter : (String) -> String) : String {
    return formatter(name)
}


// Note :
//Unit means inside the lambda we have to print; for other return types, the lambda should return a value.