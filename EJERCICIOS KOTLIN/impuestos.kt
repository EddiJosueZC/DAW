fun main(parametro: Array<String>)
{
    print("Ingrese el sueldo del empleado: ")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000)
    {
        println("debe pagar impuestos")
    }
    else
    {
        println("no paga impuestos")
    }
}