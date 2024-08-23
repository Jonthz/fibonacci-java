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
public class FibonacciContext {
     private BigInteger n;
    private BigInteger r;
    private BigInteger fn;
    private BigInteger fnm1;

    public FibonacciContext(BigInteger n, BigInteger r, BigInteger fn, BigInteger fnm1) {
        this.n = n;
        this.r = r;
        this.fn = fn;
        this.fnm1 = fnm1;
    }

    public BigInteger getN() {
        return n;
    }

    public BigInteger getR() {
        return r;
    }

    public BigInteger getFn() {
        return fn;
    }

    public BigInteger getFnm1() {
        return fnm1;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    public void setFn(BigInteger fn) {
        this.fn = fn;
    }

    public void setFnm1(BigInteger fnm1) {
        this.fnm1 = fnm1;
    }
}
