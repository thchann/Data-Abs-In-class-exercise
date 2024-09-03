// We need to return "true" if any value appears at least twice in the array.
// Return false if every element within the array is distinct

import java.util.HashMap;

public class exercise_2 {
    public static boolean doubles(int[] x){
        // Hashmap is the best? for storing key-value pairs (Hashset might be slightly better?).
        // This makes this function:
        // O(n) time complexity.
        // O(n) space complexity, as it only runs the length of the array.
        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for (int j: x){
            if (pairs.containsKey(j)){
                return true;
            } else {
                pairs.put(j, 1);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 5, 9, 9};
        System.out.println(doubles(nums));
    }
}
