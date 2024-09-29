public class MathUtil {
    // Static methods

    /**
     * Checks if a number is prime.
     * @param n The number to check.
     * @return True if n is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n<= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     * @param a First integer.
     * @param b Second integer.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Computes the least common multiple (LCM) of two numbers.
     * @param a First integer.
     * @param b Second integer.
     * @return The LCM of a and b.
     */

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /**
     * Returns the nth Fibonacci number.
     * @param n The index of the Fibonacci number.
     * @return The nth Fibonacci number.
     */

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    /**
     * Calculates the factorial of a number n.
     * @param n The number.
     * @return The factorial of n.
     */

    public static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

 /* non static methods*/

    /**
     * Checks if a number is a perfect number.
     * @param n The number.
     * @return True if n is a perfect number, false otherwise.
     */
    public boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    /**
     * Computes the sum of the digits of a number.
     * @param n The number.
     * @return The sum of its digits.
     */
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Reverses the digits of a number.
     * @param n The number.
     * @return The reversed number.
     */
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    /**
     * Checks if a number is an Armstrong number.
     * @param n The number.
     * @return True if n is an Armstrong number, false otherwise.
     */
    public boolean isArmstrongNumber(int n) {
        int sum = 0, temp = n, digits = 0;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

    /**
     * Finds the smallest prime number greater than n.
     * @param n The number.
     * @return The next prime number.
     */
    public int nextPrime(int n) {
        int next = n + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Static method testing
        System.out.println("isPrime(7): " + isPrime(7));
        System.out.println("gcd(36, 60): " + gcd(36, 60));
        System.out.println("lcm(12, 15): " + lcm(12, 15));
        System.out.println("fibonacci(5): " + fibonacci(5));
        System.out.println("factorial(5): " + factorial(5));

        // Non-static method testing
        MathUtil util = new MathUtil();
        System.out.println("isPerfectNumber(28): " + util.isPerfectNumber(28));
        System.out.println("sumOfDigits(123): " + util.sumOfDigits(123));
        System.out.println("reverseNumber(12345): " + util.reverseNumber(12345));
        System.out.println("isArmstrongNumber(153): " + util.isArmstrongNumber(153));
        System.out.println("nextPrime(10): " + util.nextPrime(10));
    }
}
