//Determina el trimestre
fun main(parametro: Array<String>)
{
    print("Ingrese el dia: ")
    val dia = readLine()!!.toInt()
    print("Ingrese el mes: ")
    val mes = readLine()!!.toInt()
    print("Ingrese el año: ")
    val año = readLine()!!.toInt()
    if (mes==1 || mes==2 || mes==3)
        print ("Corresponde al primer trimestre")
}