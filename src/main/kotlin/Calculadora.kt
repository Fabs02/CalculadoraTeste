import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    fun soma(num1: Int, num2: Int): Int{

        return num1 + num2
    }

    fun subtracao(num1: Int, num2: Int): Int{

        return num1 - num2
    }

    fun divisao(num1: Double, num2: Double): Double{

        return num1 / num2
    }

    fun multiplicacao(num1: Int, num2: Int): Int{

        return num1 * num2
    }

    fun raizQuadrada(num1: Double): Double{

        return sqrt(num1)
    }

    fun potencia(num1: Double, num2: Double): Double{

        return num1.pow (num2)
    }
}