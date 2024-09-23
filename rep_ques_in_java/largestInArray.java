public class largestInArray {
     
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 5, 60, 125}; // Example array
            int largest = numbers[0]; // Assume the first number is the largest
    
            // Loop through the array to find the largest number
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i]; // Update largest if current number is greater
                }
            }
    
            // Print the largest number
            System.out.println("The largest number in the array is: " + largest);
        }
    }
    
    

