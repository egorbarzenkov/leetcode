package ValidParentheses20;

import java.util.Stack;

public class Main2 {

    public static void main(String[] args) {
        String s = "){";
        Main2 main = new Main2();
        System.out.println(main.isValid(s));
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char a : s.toCharArray()) {
            if (!st.isEmpty() && (st.peek() == a - 1 || st.peek() == a - 2))
                st.pop();
            else
                st.push(a);
        }

        return st.isEmpty();
    }
}
