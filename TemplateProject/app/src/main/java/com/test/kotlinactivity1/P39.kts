/*
Algorithm:
Create a string to storage the result and return that String
Create and initialize the counter for the while function, starts iin the lower limit found in the parameters
Create empty String to no put a comma starting the return String
Initialize the return String with  [
Start while cycle, condition until counter is lower or equal than the upper limit given
If the read element of the list is 0 or 1 don't add anything we know these two numbers ares not prime numbers
Else, start variable in 2 and a flag to determine if the read element is prime or not
Start another while cycle, if the remainder of the division of the read element by 2 or greater is 0 flag becomes false
If flag is true means the number is prime and return String adds it
Counter ++
Out of while cycle Return the result string

funcion problema(Int numA, Int numB):String  {
    String regresar
    Entero indice = numA
    String pre = ""

    regresar += [

    while(indice <= numB){

        if(indice == 1 || indice == 0) {

        }else {
             j = 2
            bandera=true
            while (j <= indice / 2) {
                if (indice % j == 0) {
                    bandera = false
                }
                j++
            }
            if(bandera == true){
                  regresar += pre
                  regresar += indice
            }
        }
        indice++
    }
    regresar += ]
    return regresar
}
 */
fun problem(numA: Int,numB: Int):StringBuilder {
    var regresar = StringBuilder()
    var indice = numA
    var pre = ""

    regresar.append("[")

    while(indice <= numB){

        if(indice == 1 || indice == 0) {
            //No pueden ser primos
        }else {
            var j = 2
            var bandera=true
            while (j <= indice / 2) {
                if (indice % j == 0) {
                    bandera = false
                    break
                }
                ++j
            }
            if(bandera){
                  regresar.append(pre)
                  pre = ", "
                  regresar.append(indice)
            }
        }
        indice++;
    }
    regresar.append("]")

    return regresar
}

//Test case from GitHub
var a = 7
var b= 31
println("The expected output is [7, 11, 13, 17, 19, 23, 29, 31] ")
println("The output using the function is"+problem(a,b))

//Personal Testes
var c = 1
var d= 10
println("\nThe expected output is [2, 3, 5, 7] ")
println("The output using the function is"+problem(c,d))

var e = 40
var f= 60
println("\nThe expected output is [41, 43, 47, 53, 59] ")
println("The output using the function is"+problem(e,f))

