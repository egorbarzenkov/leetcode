package LetterCombinationsofaPhoneNumber17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMain {
    String[] KEYPAD = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        MyMain main = new MyMain();
        main.letterCombinations("23").forEach(System.out::println);
        Map map = new HashMap();
    }

    public List<String> letterCombinations(String digits) {
        List<String> strings = new ArrayList<>();
        if (digits.isEmpty()) {
            return strings;
        }
        for (int i = 0; i < digits.length(); i++) {
            String s = KEYPAD[digits.charAt(i) - '0'];
            if (strings.isEmpty()) {
                strings.addAll(List.of(s.split("")));
            } else {
                List<String> temp = new ArrayList<>();
                for (int j = 0; j < s.length(); j++) {
                    for (int k = 0; k < strings.size(); k++) {
                        temp.add(strings.get(k) + s.charAt(j));
                    }
                }
                strings.clear();
                strings.addAll(temp);
            }
        }
        System.gc();
        return strings;

    }
}
