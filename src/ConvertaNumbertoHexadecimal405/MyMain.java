package ConvertaNumbertoHexadecimal405;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.toHex(26));
        System.out.println(main.toHex(-1));
    }
    public String toHex(int num) {
        return Integer.toHexString(num);

//        if(num == 0) return "0";
//        long val = num;
//        if(num < 0) val = (long)(Math.pow(2,32) + num);
//        StringBuilder res = new StringBuilder();
//        while(val != 0){
//            int remainder = (int) (val % 16);
//            val = val/16;
//            if(remainder >= 10) res.append((char)(remainder+87));
//            else res.append(remainder);
//        }
//        return res.reverse().toString();
    }
}