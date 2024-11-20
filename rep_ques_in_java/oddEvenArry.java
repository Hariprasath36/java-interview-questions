public class oddEvenArry {

    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {10, 21, 34, 55, 60, 71, 82, 93, 100};
        
        // Loop through the array
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }
        }
    }
}
