package ec.edu.espol.fibonacci;

import java.math.BigInteger;

class FibT {
static class FibTree {
        private FibonacciCalculator calculator;
        private static final BigInteger two = BigInteger.valueOf(2);

        public FibTree(BigInteger n) {
            calculator = new FibonacciCalculator();
            if (n.signum() == 0) {
                calculator.setToZero();
            } else if (n.signum() == -1 && n.remainder(two).equals(BigInteger.ZERO)) {
                calculator.negate();
            } else {
                n = n.abs();
                if (n.compareTo(two) <= 0) {
                    calculator.setToOne();
                } else {
                    while (!n.equals(two)) {
                        if (n.remainder(two).equals(BigInteger.ZERO)) {
                            calculator.quick();
                            n = n.divide(two);
                        } else {
                            calculator.basic();
                            n = n.subtract(BigInteger.ONE);
                        }
                    }
                }
            }
        }

        public BigInteger cal() {
            return calculator.calculate();
        }
    }

    static void println(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        var t = new FibTree(new BigInteger(args[0]));
        println(t.cal().toString());
    }
}
