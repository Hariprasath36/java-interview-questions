

import java.util.Scanner;

public class Contain_vowels {

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        
        // Read the input string
        String str = scan.nextLine();
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Convert the character to lowercase
            char ch = Character.toLowerCase(str.charAt(i));
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Given string contains: " + str.charAt(i) + " at the index " + i);
            }
        }
        
        // Close the scanner
        scan.close();
    }
}
