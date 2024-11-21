public class PrimeNumber {

    public static void main(String[] args) {
        int num = 90; // Number to check
        boolean isPrime = true; // Assume number is prime initially

        // Handle numbers <= 1 (not prime)
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check divisors from 2 to num / 2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
