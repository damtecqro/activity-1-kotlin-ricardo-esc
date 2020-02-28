/*
Algorithm:
Create a string to storage the result and return that String
Create and initialize the counter for the while function, starts in 1 because the comparison will be with the first element
Add the first element to the String result
Start while cycle, condition until counter is lower than the size of the list
If the read element of the list is the same as the previous add a coma and the element
If not end that sublist adding a ] and start a new sublist with [ and adding the new element
Counter++
Out of while cycle Return the result string

 funcion problema(String lista) : String {
    String regresar
    Entero x = 1
    regresar = regresar + '[ ['
    regresar = regresar + lista[0]

    while(x < lista.tamaño){
    si(list[x] == list[(x-1)]){
        regresar = regresar +","+ lista[x]
    }
        sino{
        regresar = regresar + '] [ ' list[x]
    }
        x++
    }
   regresar = regresar + '] ]'

return regresar
}
 */

fun problem(list: String):StringBuilder {
    var regresar = StringBuilder()
    var x= 1;
    regresar.append("[[")
    regresar.append(list[0])

    while(x < list.length){
    if(list[x] == list[(x-1)]){
        regresar.append(", ",list[x])
    }
        else{
        regresar.append("], ["+list[x])
    }
        x++;
    }
    regresar.append("]]")

return regresar
}

//Test case from GitHub
var a = "aaaabccaadeeee"
println("The expected output is [[a, a, a, a], [b], [c, c], [a, a], [d], [e, e, e, e]] ")
println("The output using the function is"+problem(a))

//Personal Testes
var b = "ab"
println("\nThe expected output is [[a], [b]] ")
println("The output using the function is"+problem(b))

var c = "ababababb"
println("\nThe expected output is [[a], [b], [a], [b], [a], [b], [a], [b, b]] ")
println("The output using the function is"+problem(c))




