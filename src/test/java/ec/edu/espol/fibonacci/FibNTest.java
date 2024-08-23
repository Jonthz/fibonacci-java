/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.fibonacci;

import java.math.BigInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zambrano
 */
public class FibNTest {
    
    public FibNTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of fib method, of class FibN.
     */
    // test antes de refactorizar
    /**@Test
    void testFibCalculation() {
        // Caja Blanca: Verifica que el método fib calcula correctamente Fibonacci con una lista larga de parámetros.
        BigInteger result = FibN.fib(BigInteger.valueOf(2), BigInteger.valueOf(5), BigInteger.ONE, BigInteger.ONE);
        assertEquals(BigInteger.valueOf(5), result, "El cálculo de Fibonacci para n=2 falló.");
    }

    @Test
    void testQFibCalculation() {
        // Caja Blanca: Verifica que el método qfib maneja correctamente la multiplicación rápida de Fibonacci.
        BigInteger result = FibN.qfib(BigInteger.valueOf(10), BigInteger.valueOf(20), BigInteger.valueOf(55), BigInteger.valueOf(34));
        assertEquals(BigInteger.valueOf(6765), result, "El cálculo rápido de Fibonacci para n=10 falló.");
    }**/
    
    // test despues de refactorizar
     @Test
    void testFibCalculation() {
        // Caja Blanca: Verifica que el método fib calcula correctamente Fibonacci con el uso de FibonacciContext.
        FibonacciContext context = new FibonacciContext(BigInteger.valueOf(2), BigInteger.valueOf(5), BigInteger.ONE, BigInteger.ONE);
        BigInteger result = FibN.fib(context);
        assertEquals(BigInteger.valueOf(5), result, "El cálculo de Fibonacci para n=2 falló.");
    }

    @Test
    void testQFibCalculation() {
        // Caja Blanca: Verifica que el método qfib maneja correctamente la multiplicación rápida de Fibonacci con el uso de FibonacciContext.
        FibonacciContext context = new FibonacciContext(BigInteger.valueOf(10), BigInteger.valueOf(20), BigInteger.valueOf(55), BigInteger.valueOf(34));
        BigInteger result = FibN.qfib(context);
        assertEquals(BigInteger.valueOf(6765), result, "El cálculo rápido de Fibonacci para n=10 falló.");
    }
}
    

