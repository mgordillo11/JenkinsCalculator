import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    /*
     * Returns the n'th number in the fibonacci sequence
     * https://en.wikipedia.org/wiki/Fibonacci_number
     * Example below
     * n = x
     * 0 = 0
     * 1 = 1
     * 2 = 1
     * 3 = 2
     * 4 = 3
     * 5 = 5
     * .
     * .
     * .
     * etc
     */
    public static void fibonacciNumberFinder(int n) {
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    /*
     * Returns binary value of the given int number
     * The binary number will be stored as a string
     * if int a = 0 then this method returns: 0
     * if int a = 10 then this method returns: 1010
     * if int a = 16 then this method returns: 10000
     */
    public static void intToBinaryNumber(int n) {
        System.out.println(Integer.toBinaryString(n));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator\nEnter a command: (Type \'EXIT\' if DONE)");
        Scanner in = new Scanner(System.in);

        while (true) {
            String commandTerminal = in.nextLine();

            if (commandTerminal.equals("EXIT"))
                break;

            String[] commandParts = commandTerminal.split(" ");
            String commandMethod = commandParts[0];

            int a = 0;
            int b = 0;

            if (commandMethod.equals("add") || commandMethod.equals("subtract")
                    || commandMethod.equals("multiply") || commandMethod.equals("divide")) {
                a = Integer.parseInt(commandParts[1]);
                b = Integer.parseInt(commandParts[2]);
            } else {
                a = Integer.parseInt(commandParts[1]);
            }

            if (commandMethod.equals("add"))
                add(a, b);
            if (commandMethod.equals("subtract"))
                subtract(a, b);
            if (commandMethod.equals("multiply"))
                multiply(a, b);
            if (commandMethod.equals("divide"))
                divide(a, b);
            if (commandMethod.equals("fibonacci"))
                fibonacciNumberFinder(a);
            if (commandMethod.equals("binary"))
                intToBinaryNumber(a);

            // System.out.println(Arrays.toString(commandParts));
        }

        in.close();

    }
}
