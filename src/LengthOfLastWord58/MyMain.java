package LengthOfLastWord58;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.lengthOfLastWord("Hello World"));
        System.out.println(main.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(main.lengthOfLastWord("luffy is still joyboy"));
        System.out.println(main.lengthOfLastWord("a"));
    }

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (length != 0 && chars[i] == ' ') {
                return length;
            } else if (chars[i] != ' ') {
                length++;
            }
        }
        return length;
    }
}
