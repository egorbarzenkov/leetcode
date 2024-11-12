package RotateString796;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
//        System.out.println(myMain.rotateString("abcde", "cdeab"));
//        System.out.println(myMain.rotateString("abcde", "abced"));
        System.out.println(myMain.rotateString("defdefdefabcabc", "defdefabcabcdef"));
    }
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        // Create a new string by concatenating 's' with itself
        String doubledString = s + s;

        // Use contains to search for 'goal' in 'doubledString'
        // If contains return true, 'goal' is a substring
        return doubledString.contains(goal);
    }
}
