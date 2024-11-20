public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 30, -20, -2, 0};

        // Initialize min and max with the first element
        int min = arr[0];
        int max = arr[0];

        // Traverse the array to find min and max
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
