package ArrangingCoins441;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.arrangeCoins(5));
        System.out.println(myMain.arrangeCoins(8));
    }

    public int arrangeCoins(int n) {
        int i = 1;
        while (n > 0) {
            i ++;
            n -= i;
        }
        return i - 1;
//        return (int) (0.5*(-1 + Math.sqrt(1+8L*n)));
    }
}
