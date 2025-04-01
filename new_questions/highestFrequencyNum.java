package new_questions;

import java.util.HashMap;

public class highestFrequencyNum {


     public static void main(String[] args) {
        int[] arr = {9, 9, 4, 4, 3, 2, 9, 8, 3, 0};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(frequencyMap);
        
        int maxFrequency = 0;
        int numberWithMaxFrequency = arr[0]; 

        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentNumber = entry.getKey();
            int currentFrequency = entry.getValue();
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency; 
                numberWithMaxFrequency = currentNumber; 
            }
        }
        System.out.println("The number with the highest frequency is: " + numberWithMaxFrequency);
    }
}

