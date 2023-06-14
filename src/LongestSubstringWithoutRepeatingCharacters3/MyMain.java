package LongestSubstringWithoutRepeatingCharacters3;


public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        System.out.println(main.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(main.lengthOfLongestSubstring("bbbbb"));
        System.out.println(main.lengthOfLongestSubstring("jbpnbwwd"));
    }

    public int lengthOfLongestSubstring(String s) {
        var charToIndex = new int[128];
        for (var i = 0; i < charToIndex.length; i++) {
            charToIndex[i] = -1;
        }
        var prev = -1;
        var maxLength = 0;
        for (var i = 0; i < s.length(); i++) {
            var character = s.charAt(i);
            prev = Math.max(prev, charToIndex[character]);
            var length = i - prev;
            if (maxLength < length) {
                maxLength = length;
            }
            charToIndex[character] = i;
        }
        return maxLength;
    }
//    public int lengthOfLongestSubstring(String s) {
//        String res = "";
//        StringBuilder curr = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (!curr.toString().contains(String.valueOf(s.charAt(i)))) {
//                curr.append(s.charAt(i));
//                for (int j = i+1; j < s.length(); j++) {
//                    if (!curr.toString().contains(String.valueOf(s.charAt(j)))) {
//                        curr.append(s.charAt(j));
//                    } else if (curr.length() > res.length()) {
//                        res = curr.toString();
//                        curr = new StringBuilder();
//                        break;
//                    } else {
//                        curr = new StringBuilder();
//                        break;
//                    }
//                }
//            }
//        }
//
//        return curr.length() > res.length() ? curr.length() : res.length();
//    }
}
