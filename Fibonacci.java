/**
 * The Fibonacci class calculates the nth term in the Fibonacci sequence using recursion.
 * The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones.
 * This class provides a recursive method to calculate the nth term in the Fibonacci sequence.
 *
 * @author Alessandro Maccarrone
 */
public class Fibonacci {

    /**
     * Calculates the nth term in the Fibonacci sequence using recursion.
     *
     * @param n the position of the term to calculate
     * @return the nth term in the Fibonacci sequence
     */
    public static int recursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursive(n - 1) + recursive(n - 2);
        }
    }

    /**
     * Main method that calls the recursive method to calculate the nth term in the Fibonacci sequence.
     * Outputs the result with descriptive text.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int n = 10;
        int result = recursive(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is: " + result);
    }
}
