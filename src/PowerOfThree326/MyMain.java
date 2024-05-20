package PowerOfThree326;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
//        System.out.println(myMain.isPowerOfThree(27));
//        System.out.println(myMain.isPowerOfThree(0));
//        System.out.println(myMain.isPowerOfThree(-1));
        System.out.println(myMain.isPowerOfThree(45));
    }

    public boolean isPowerOfThree(int n) {
//        if(n==0){
//            return false;
//        }
//        if(n==1){
//            return true;
//        }
//        if(n%3==0){
//            return isPowerOfThree(n/3);
//        }
//        return false;

        if (n==0) {return false;}
        while (n%3==0) {
            n/=3;
        }
        return (n==1);
    }
}
