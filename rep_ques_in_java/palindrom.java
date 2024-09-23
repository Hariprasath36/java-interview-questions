public class palindrom {

    public static void main(String[] args) {
        int num = 121; // The number to check
        int temp = num; // Store the original number
        int rev = 0; // This will store the reversed number
        int rem; // For storing remainder
        
        while (num > 0) {
            rem = num % 10; // Get the last digit
            rev = rev * 10 + rem; // Build the reversed number
            num = num / 10; // Remove the last digit from num
        }
        
        // Now compare the reversed number (rev) with the original number (temp)
        if (rev == temp) {
            System.out.println(temp + " is a palindrome number.");
        } else {
            System.out.println(temp + " is not a palindrome number.");
        }
    }
}
