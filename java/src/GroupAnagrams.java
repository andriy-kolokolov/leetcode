import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // iterate, sort each word,
        // { key: { 0, 1, 3 } // <anagram, idxs[]>

        HashMap<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(i);
        }

        List<List<String>> result = new ArrayList<>();
        for (List<Integer> indexes : map.values()) {
            List<String> group = new ArrayList<>();
            for (Integer idx : indexes) { // [0, 1, 3]
                group.add(strs[idx]);
            }
            result.add(group);
        }

        return result;
    }
}
