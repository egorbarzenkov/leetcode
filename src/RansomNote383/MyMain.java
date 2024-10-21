package RansomNote383;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.canConstruct("a", "b"));
        System.out.println(myMain.canConstruct("aa", "ab"));
        System.out.println(myMain.canConstruct("aa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ints = new int[26];
        for (char c : magazine.toCharArray()) {
            ints[c-'a']++;
        }
        for (char c: ransomNote.toCharArray()) {
            if (ints[c-'a'] == 0) {
                return false;
            }
            ints[c-'a']--;
        }
        return true;
    }

}
