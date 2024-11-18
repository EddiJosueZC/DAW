fun main(parametro: Array<String>)
{
    print("Ingrese la medida del lado del cuadrado: ")
    val lado = readLine()!!.toInt()
    val perimetro = lado * 4
    print("El perimetro del cuadrado es $perimetro")
}