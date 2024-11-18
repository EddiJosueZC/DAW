fun main(parametro: Array<String>)
{
    //programa en el cual se ingresan cuatro numeros enteros, calcular e imprimir
    //la suma de los dos primeros y el producto del tercero y el cuarto
    print("Ingrese el primer valor: ")
    val valor1 = readLine()!!.toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readLine()!!.toInt()
    print ("Ingrese el tercer valor: ")
    val valor3 = readLine()!!.toInt()
    print("Ingrese el cuarto valor: ")
    val valor4 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $suma")
    val producto = valor3 * valor4
    println("el producto de $valor3 x $valor4 es: $producto")
}