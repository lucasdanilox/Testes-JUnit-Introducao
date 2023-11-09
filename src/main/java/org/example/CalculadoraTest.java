package org.example;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.Somar(10, 10);

        assertEquals(20, resultado);
    }

    @Ignore
    public void testSomarSemAnnotation() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.Somar(10, 10);

        assertEquals(20, resultado);
    }

    @Test
    public void testSomarNumerosNegativos() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.Somar(-10, -10);

        assertEquals(-20, resultado);

    }

}
