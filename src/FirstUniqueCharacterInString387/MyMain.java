package FirstUniqueCharacterInString387;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.firstUniqChar("leetcode"));
        System.out.println(myMain.firstUniqChar("loveleetcode"));
        System.out.println(myMain.firstUniqChar("aabb"));
    }
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
