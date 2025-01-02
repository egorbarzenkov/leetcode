package ScoreofString3110;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.scoreOfString("hello"));
    }

    public int scoreOfString(String s) {
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            res += Math.abs(s.charAt(i-1) - s.charAt(i));
        }
        return res;
    }
}
