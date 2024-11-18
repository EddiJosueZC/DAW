//muesta el > de 3 números
fun main(parametro: Array<String>)
{
    print("Ingrese el primer valor: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo valor: ")
    val num2 = readLine()!!.toInt()
    print("Ingrese el tercer valor: ")
    val num3 = readLine()!!.toInt()
    if (num1 > num2 && num1 > num3)
        print(num1)
    else
        if (num2 > num3)
            print(num2)
        else
            print(num3)
}