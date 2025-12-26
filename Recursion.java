public class Recursion{

    /* Java Recursion
    Recursion is a technique where a method calls iteslf.
    It is used to break complex problems into smaller, simpler
    problems that are easier to solve. */

    /* In this example, recursion is used to add a range of numbers
    by repeatedly reducing the problem to adding two numbers. */

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    /* Halting condition
    Recursive methods must have a halting condition to stop calling themselves.
    Without it, infinite recursion can occur, similar to an infinite loop.
    The halting condition defines when the recursion should stop.
    In this example, the recursion ends when the end value is no longer
    greater than the start value. */

    public static int soma(int start, int end) {
        if (end > start) {
            return end + soma(start, end - 1);
        } else {
            return end;
        }
    }

    /* Countdown with Recursion
    This example demonstrates how to use recursion to create a countdown function. */

    static void countdown (int n){
        if (n > 0) {
            System.out.print(n + " ");
            countdown(n - 1);
        }
    }

    /*Factorial with Recursion
    This example calculates factorial with recursion */

    public static int fact(int a) {
        if (a > 1) {
            return a * fact(a - 1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args){
        int result = sum(10);
        System.out.println(result);

        int resultado = soma(5, 10);
        System.out.println(resultado);

        countdown(5);

        System.out.println("\nO fatorial de 5 é " + fact(5));
    }
}