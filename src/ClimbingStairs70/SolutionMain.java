package ClimbingStairs70;

public class SolutionMain {
    public static void main(String[] args) {
        SolutionMain main = new SolutionMain();
        System.out.println(main.climbStairs(2));
        System.out.println(main.climbStairs(3));
        System.out.println(main.climbStairs(4));
    }
    public int climbStairs(int n) {
        if(n==1) return 1;

        if(n==2) return 2;

        int[] a =  new int[n];
        a[0]=1;
        a[1]=2;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
}
