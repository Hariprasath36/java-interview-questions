package new_questions;

import java.util.HashMap;

public class Frequency {

    public static void main(String[] args) {
        int[] arr = {9, 9, 4, 4, 3, 2, 9, 8, 3, 0};
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(frequencyMap);
        
    }
}
