package ValidParentheses20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String s = "){";
        Main main = new Main();
        System.out.println(main.isValid(s));
    }
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>()
        {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};
        Stack<Character> stack = new Stack();
        if (s.isEmpty()) return true;
        if (s.length() % 2 != 0) return false;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty() || !map.get(stack.peek()).equals(s.charAt(i))) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
