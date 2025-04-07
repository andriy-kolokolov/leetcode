import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] kFrequent = new int[k];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < kFrequent.length; i++) {
            int largest = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            kFrequent[i] = largest;
            map.remove(largest);
        }

        return kFrequent;
    }
}
