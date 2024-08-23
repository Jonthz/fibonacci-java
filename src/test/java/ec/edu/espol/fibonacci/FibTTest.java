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
public class FibTTest {

    public FibTTest() {
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
     * Test of println method, of class FibT.
     */
    /** Test antes de refactorizar
    @Test
    void testBasicCalculation() {
        // TS01
        FibT.Cal basic = new FibT.Basic();
        basic.fn = BigInteger.ONE;
        basic.fnm1 = BigInteger.ONE;
        basic.cal(); // Realiza la operación básica
        assertEquals(BigInteger.valueOf(2), basic.fn, "Basic calculation failed for Fibonacci");
    }

    @Test
    void testQuickCalculation() {
        // TS02
        FibT.Cal quick = new FibT.Quick();
        quick.fn = BigInteger.ONE;
        quick.fnm1 = BigInteger.ONE;
        quick.cal(); // Realiza la operación rápida
        assertEquals(BigInteger.valueOf(3), quick.fn, "Quick calculation failed for Fibonacci");
    }

    @Test
    void testJust1Calculation() {
        // TS03
        FibT.Cal just1 = new FibT.Just1();
        just1.cal(); // Debe configurar fn a 1
        assertEquals(BigInteger.ONE, just1.fn, "Just1 calculation failed for Fibonacci");
    }

    @Test
    void testJust0Calculation() {
        // Caja Blanca: Verifica la clase interna Just0 en FibT
        FibT.Cal just0 = new FibT.Just0();
        just0.cal(); // Debe configurar fn a 0
        assertEquals(BigInteger.ZERO, just0.fn, "Just0 calculation failed for Fibonacci");
    }

    @Test
    void testNegateCalculation() {
        // Caja Blanca: Verifica la clase interna Negate en FibT
        FibT.Cal negate = new FibT.Negate();
        negate.fn = BigInteger.ONE;
        negate.cal(); // Debe negar el valor de fn
        assertEquals(BigInteger.valueOf(-1), negate.fn, "Negate calculation failed for Fibonacci");
    }
    /**
     * @Test void testCalWithZero() { // TC01 BigInteger result = new
     * FibT.FibTree(BigInteger.ZERO).cal(); assertEquals(BigInteger.ZERO,
     * result, "Fibonacci de 0 debe ser 0"); }
     *
     * @Test void testCalWithNegativeTwo() { // TC02 BigInteger result = new
     * FibT.FibTree(BigInteger.valueOf(-2)).cal();
     * assertEquals(BigInteger.valueOf(-1), result, "Fibonacci de -2 debe ser
     * -1"); }
     *
     * @Test void testCalWithTen() { // TC03 BigInteger result = new
     * FibT.FibTree(BigInteger.valueOf(10)).cal();
     * assertEquals(BigInteger.valueOf(55), result, "Fibonacci de 10 debe ser
     * 55"); }
     *
     * @Test void testCalWithTwo() { // TC04 BigInteger result = new
     * FibT.FibTree(BigInteger.valueOf(2)).cal(); assertEquals(BigInteger.ONE,
     * result, "Fibonacci de 2 debe ser 1"); }
     *
     * @Test void testCalWithTwenty() { // TC05 BigInteger result = new
     * FibT.FibTree(BigInteger.valueOf(20)).cal();
     * assertEquals(BigInteger.valueOf(6765), result, "Fibonacci de 20 debe ser
     * 6765"); }
 *
     **/
   // Test despues de refactorizar
    
    @Test
   
    void testCalWithZero() {
        // TC01
        BigInteger result = new FibT.FibTree(BigInteger.ZERO).cal();
        assertEquals(BigInteger.ZERO, result, "Fibonacci de 0 debe ser 0");
    }

    @Test
    void testCalWithNegativeTwo() {
        // TC02
        BigInteger result = new FibT.FibTree(BigInteger.valueOf(-2)).cal();
        assertEquals(BigInteger.valueOf(-1), result, "Fibonacci de -2 debe ser -1");
    }

    @Test
    void testCalWithTen() {
        // TC03
        BigInteger result = new FibT.FibTree(BigInteger.valueOf(10)).cal();
        assertEquals(BigInteger.valueOf(55), result, "Fibonacci de 10 debe ser 55");
    }

    @Test
    void testCalWithTwo() {
        // TC04
        BigInteger result = new FibT.FibTree(BigInteger.valueOf(2)).cal();
        assertEquals(BigInteger.ONE, result, "Fibonacci de 2 debe ser 1");
    }

    
}
