import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    private static final char DLM = '|';

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append(DLM).append(str);
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        char[] chars = str.toCharArray();

        StringBuilder length = new StringBuilder(); // 3
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] != DLM) {
                length.append(chars[i]);
            } else {
                int lengthInt = Integer.parseInt(length.toString());
                res.add(str.substring(i + 1, i + 1 + lengthInt));
                i = i + lengthInt;
                length = new StringBuilder();
            }
        }

        return res;
    }
}
