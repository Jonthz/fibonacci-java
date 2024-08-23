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
public class FibonacciCalculatorTest {
    
    public FibonacciCalculatorTest() {
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

     @Test
    void testBasicCalculation() {
        // TS01: Verifica que el método `basic` calcula correctamente Fibonacci de manera básica.
        FibonacciCalculator calculator = new FibonacciCalculator();
        calculator.basic();
        assertEquals(BigInteger.valueOf(2), calculator.calculate(), "Basic calculation failed for Fibonacci");
    }

    @Test
    void testQuickCalculation() {
        // TS02: Verifica que el método `quick` maneja correctamente la multiplicación rápida de Fibonacci.
        FibonacciCalculator calculator = new FibonacciCalculator();
        calculator.quick();
        assertEquals(BigInteger.valueOf(3), calculator.calculate(), "Quick calculation failed for Fibonacci");
    }

    @Test
    void testJust1Calculation() {
        // TS03: Verifica que la clase interna `Just1` en `FibonacciCalculator` configura fn a 1.
        FibonacciCalculator calculator = new FibonacciCalculator();
        calculator.setToOne();
        assertEquals(BigInteger.ONE, calculator.calculate(), "Just1 calculation failed for Fibonacci");
    }

    @Test
    void testJust0Calculation() {
        // TS04: Verifica que la clase interna `Just0` en `FibonacciCalculator` configura fn a 0.
        FibonacciCalculator calculator = new FibonacciCalculator();
        calculator.setToZero();
        assertEquals(BigInteger.ZERO, calculator.calculate(), "Just0 calculation failed for Fibonacci");
    }

    @Test
    void testNegateCalculation() {
        // TS05: Verifica que la clase interna `Negate` en `FibonacciCalculator` niega correctamente fn.
        FibonacciCalculator calculator = new FibonacciCalculator();
        calculator.negate();
        assertEquals(BigInteger.valueOf(-1), calculator.calculate(), "Negate calculation failed for Fibonacci");
    }
    
}
