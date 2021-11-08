import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    val calculadora = Calculadora()

    @Test
    fun soma() {
        assertEquals(6, calculadora.soma(3, 3))
    }

    @Test
    fun subtracao() {
        assertEquals(5, calculadora.subtracao(6, 1))
    }

    @Test
    fun divisao() {
        assertEquals(5.0, calculadora.divisao(25.0, 5.0))
    }

    @Test
    fun multiplicacao() {
        assertEquals(25, calculadora.multiplicacao(5, 5))
    }

    @Test
    fun raizQuadrada() {
        assertEquals(7.0, calculadora.raizQuadrada(49.0))
    }

    @Test
    fun potencia() {
        assertEquals(49.0, calculadora.potencia(7.0, 2.0))
    }
}