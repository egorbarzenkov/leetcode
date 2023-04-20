package LongestCommonPrefix14;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Main main = new Main();
        System.out.println(main.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
