/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.fibonacci;

import java.math.BigInteger;

/**
 *
 * @author Zambrano
 */
public class FibonacciCalculator {
     private BigInteger fn;
    private BigInteger fnm1;

    public FibonacciCalculator() {
        this.fn = BigInteger.ONE;
        this.fnm1 = BigInteger.ONE;
    }

    public void basic() {
        var fnp1 = fn.add(fnm1);
        fnm1 = fn;
        fn = fnp1;
    }

    public void quick() {
        var two = BigInteger.valueOf(2);
        var f2n = fnm1.multiply(two).add(fn).multiply(fn);
        var f2nm1 = fnm1.multiply(fnm1).add(fn.multiply(fn));
        fn = f2n;
        fnm1 = f2nm1;
    }

    public void setToOne() {
        fn = BigInteger.ONE;
    }

    public void setToZero() {
        fn = BigInteger.ZERO;
    }

    public void negate() {
        fn = fn.negate();
    }

    public BigInteger calculate() {
        return fn;
    }
}
