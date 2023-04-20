package NumberOf1Bits191;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.hammingWeight(11));
        System.out.println(main.hammingWeight(128));
        System.out.println(main.hammingWeight(-3));
    }

    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
//    public int hammingWeight(int n) {
//        int res = 0;
//        for (int i = 0; i < 32; i++) {
//            if ((n&1) == 1) res ++;
//            n>>=1;
//        }
//        return res;
//    }
}
