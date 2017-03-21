import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by rajib.khan on 2/18/17.
 */
public class Fibonacci {

    public static BigInteger fibTail(int x) {
        return fibTailHelper(BigInteger.ONE, BigInteger.ZERO, BigInteger.valueOf(x));
    }
    public static BigInteger fibTailHelper(BigInteger acc1, BigInteger acc2, BigInteger x) {
        if (x.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else if (x.equals(BigInteger.ONE)) {
            return acc1.add(acc2);
        } else {
            return fibTailHelper(acc2, acc1.add(acc2), x.subtract(BigInteger.ONE));
        }
    }

    public static BigInteger fibonacciIterative(int number) {
        if (number == 1 || number == 2) {
            return BigInteger.ONE;
        }


        BigInteger fibo1 = BigInteger.ZERO;
        BigInteger fibo2 = BigInteger.ONE;
        BigInteger fibonacci = BigInteger.ONE;

        ArrayList<BigInteger> fibonacciList = new ArrayList<BigInteger>();
        fibonacciList.add(fibo1);
        fibonacciList.add(fibo2);

        for (int i = 0; i <= number -2; i++) {
            fibonacci = fibo1.add(fibo2);
            fibo1 = fibo2;
            fibo2 = fibonacci;
            fibonacciList.add(fibo2);
        }

        System.out.print(fibonacciList);
        return fibonacci;
    }

    public static void main(String[] args) {
        //recursion
        System.out.println(fibTail(10));

        //iterative
        fibonacciIterative(10);
    }
}
