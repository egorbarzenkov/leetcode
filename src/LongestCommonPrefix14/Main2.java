package LongestCommonPrefix14;

public class Main2 {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        Main2 main = new Main2();
        System.out.println(main.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() -1 < i ||c != strs[j].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
