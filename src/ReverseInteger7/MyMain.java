package ReverseInteger7;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.reverse(-123));
        System.out.println(myMain.reverse(1534236469));
    }

    public int reverse(int x) {
        try {
            if (x > 0) {
                return Integer.parseInt(new StringBuilder().append(x).reverse().toString());
            }
            return - Integer.parseInt(new StringBuilder().append(Math.abs(x)).reverse().toString());
        } catch (Exception exception) {
            return 0;
        }


//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
//            if (
//                    rev > Integer.MAX_VALUE / 10 ||
//                            (rev == Integer.MAX_VALUE / 10 && pop > 7)
//            ) return 0;
//            if (
//                    rev < Integer.MIN_VALUE / 10 ||
//                            (rev == Integer.MIN_VALUE / 10 && pop < -8)
//            ) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;
    }
}
