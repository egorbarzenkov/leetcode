package AddDigits258;

public class MyMain {

    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.addDigits(38));
    }

    public int addDigits(int num) {
        while (num / 10 >= 1) {
            int tempDec = num % 10;
            int tempDec1 = num / 10;
            num = tempDec + tempDec1;
        }
        return num;
    }

    //todo
//    if(num == 0) return 0;
//        else if(num % 9 == 0) return 9;
//        else return num % 9;
}
