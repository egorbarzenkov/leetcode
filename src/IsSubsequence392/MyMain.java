package IsSubsequence392;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
//        System.out.println(myMain.isSubsequence("abc", "ahbgdc"));
//        System.out.println(myMain.isSubsequence("axc", "ahbgdc"));
//        System.out.println(myMain.isSubsequence("b", "c"));
        System.out.println(myMain.isSubsequence("aaaaaa", "bbaaaa"));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            index = t.indexOf(s.charAt(i), index);
            if (index < 0) {
                return false;
            }
            index++;
        }
        return true;
    }
}
