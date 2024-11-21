public class PalindromeString {

    public static void main(String[] args) {
        String str = "LoL"; // The string to check
        String reversedStr = ""; // This will store the reversed string
        
        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        
        // Compare the reversed string with the original string
        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
