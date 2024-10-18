package CountingBits338;

import java.util.Arrays;

public class MyMain {

    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(Arrays.toString(myMain.countBits(2)));
        System.out.println(Arrays.toString(myMain.countBits(5)));
    }

    public int[] countBits(int n) {
        int[] resInts = new int[n+1];
        for (int i = 0; i <= n; i++) {
            resInts[i] = Integer.bitCount(i);
        }
        return resInts;
    }
}
