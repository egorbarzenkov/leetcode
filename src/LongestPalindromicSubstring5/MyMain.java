package LongestPalindromicSubstring5;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.longestPalindrome("babad"));
    }

//    public String longestPalindrome(String s) {
//        int start = -1;
//        int end = -1;
//        for (int i = 0; i < s.length(); i++) {
//
//        }
//
//        return s.substring(start, end);
//    }

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
