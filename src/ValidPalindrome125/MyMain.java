package ValidPalindrome125;

import java.util.Locale;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        System.out.println(main.isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(main.isPalindrome("race a car"));
        System.out.println(main.isPalindrome("0P"));
    }
    public boolean isPalindrome(String s) {
        String string = s.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "");
        System.out.println(string);
        return new StringBuilder(string).reverse().toString().equals(string);
    }
}
