package ec.edu.espol.fibonacci;

import java.math.BigInteger;

class FibN{

 static BigInteger fib(FibonacciContext context) {
    while (context.getN().compareTo(context.getR()) < 0) {
        var fnp1 = context.getFn().add(context.getFnm1());
        context.setFnm1(context.getFn());
        context.setFn(fnp1);
        context.setN(context.getN().add(BigInteger.ONE));
        println(context.getN().toString() + " / " + context.getR().toString() + " | " + String.valueOf(context.getN().divide(context.getR()).floatValue() * 100) + "%");
    }
    return context.getFn();
}

static BigInteger qfib(FibonacciContext context) {
    var two = BigInteger.valueOf(2);
    while (context.getN().multiply(two).compareTo(context.getR()) < 0) {
        var f2n = context.getFnm1().multiply(two).add(context.getFn()).multiply(context.getFn());
        var f2nm1 = context.getFnm1().multiply(context.getFnm1()).add(context.getFn().multiply(context.getFn()));
        context.setFn(f2n);
        context.setFnm1(f2nm1);
        context.setN(context.getN().multiply(two));
        println(context.getN().toString() + " / " + context.getR().toString() + " | " + String.valueOf(context.getN().divide(context.getR()).floatValue() * 100) + "% (quick mode)");
    }
    if (context.getN().compareTo(context.getR()) <= 0) {
        context.setFn(fib(context));
    }
    return context.getFn();
}

  static BigInteger cal(BigInteger r){
    var two = BigInteger.valueOf(2);
    if (r.compareTo(two) <= 0){
      return BigInteger.ONE;
    } else {
      FibonacciContext fbn = new FibonacciContext(two, r, BigInteger.ONE, BigInteger.ONE);
      return qfib(fbn);
    }
  }

  static void println(String str){
    System.out.println(str);
  }

  public static void main(String[] args){
    println(cal(new BigInteger(args[0])).toString());
    // fib(new BigInteger(args[0]));
  } 
}
