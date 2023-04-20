package ReverseBits190;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        System.out.println(main.reverseBits(43261596));//964176192
        System.out.println(main.reverseBits(-3));//3221225471
    }

    public int reverseBits(int n) {
//        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
        n = ((n & 0xffff0000) >>> 16) | ((n & 0x0000ffff) << 16);
        n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
        n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
        n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);
        n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);

        return n;
    }
}
