package IsomorphicStrings205;

import java.util.HashMap;
import java.util.HashSet;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        System.out.println(main.isIsomorphic("egg", "add"));
//        System.out.println(main.isIsomorphic("foo", "bar"));
//        System.out.println(main.isIsomorphic("paper", "title"));
        System.out.println(main.isIsomorphic("badc", "baba"));
    }
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) || map.containsValue(t.charAt(i))) {
                if (map.get(s.charAt(i)) == null) {
                    return false;
                }
                if (map.get(s.charAt(i)).equals(t.charAt(i))) {
                    continue;
                } else {
                    return false;
                }
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
