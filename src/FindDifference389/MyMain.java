package FindDifference389;

public class MyMain {
    public static void main(String[] args) {

    }

    public char findTheDifference(String s, String t) {
        int[] ints = new int[26];
        for (char c: t.toCharArray()) {
            ints[c-'a']++;
        }

        for (char c: s.toCharArray()) {
            ints[c-'a']--;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 1) {
                return (char) (i + 'a');
            }
        }
        return ' ';
    }
}
