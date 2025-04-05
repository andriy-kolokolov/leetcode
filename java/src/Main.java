import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> res = new GroupAnagrams().groupAnagrams(
                new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}
        );
        // expected res: [["bat"],["nat","tan"],["ate","eat","tea"]]

        System.out.println(res);
    }
}