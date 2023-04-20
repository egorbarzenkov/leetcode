package ValidAnagram242;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i)) > -1) {
                t = t.replaceFirst(String.valueOf(s.charAt(i)), "");
            } else {
                return false;
            }
        }
        return t.isEmpty();
    }
}
