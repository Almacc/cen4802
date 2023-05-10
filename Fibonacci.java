public class Fibonacci {
    public static void main(String[] args) {
        int inputs = 10;

            int recursiveResult = recursive(inputs);

            System.out.println("The " + inputs + " term of the Fibonacci sequence is: " + recursiveResult);

    }


    public static int recursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursive(n - 1) + recursive(n - 2);
        }
    }
}