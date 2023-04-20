package Sqrt69;

public class SolutionMain {
    public static void main(String[] args) {
        SolutionMain main = new SolutionMain();
        System.out.println(main.mySqrt(4));
        System.out.println(main.mySqrt(8));
    }

    public int mySqrt(int x) {
        int l = 1;
        int r = x;

        while(l <= r){
            int mid = (l + r) / 2;

            if(x / mid == mid){
                return mid;
            } else if(mid > x / mid){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return r;
    }
}
