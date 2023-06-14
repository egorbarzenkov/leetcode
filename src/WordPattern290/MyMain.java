package WordPattern290;

import java.util.HashMap;
import java.util.Map;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        System.out.println(main.wordPattern("abba", "dog cat cat dog"));
//        System.out.println(main.wordPattern("abba", "dog cat cat fish"));
        System.out.println(main.wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] strings = s.split(" ");
        if (pattern.length() != strings.length) {
            return false;
        }
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(strings[i])) {
                return false;
            } else if (map.containsValue(strings[i]) && !map.containsKey(pattern.charAt(i))) {
                return false;
            }else {
                map.put(pattern.charAt(i), strings[i]);
            }
        }
        return true;
    }
}
