package FindIndexOfFirstOccurrenceInString28;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.strStr("sadbutsad", "sad"));
        System.out.println(main.strStr("leetcode", "leeto"));
        System.out.println(main.strStr("aaa", "aaaa"));
        System.out.println(main.strStr("mississippi", "issip"));
    }
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
