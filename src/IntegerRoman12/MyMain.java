package IntegerRoman12;

import java.util.HashMap;
import java.util.Map;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.intToRoman(3749));
    }
    public String intToRoman(int num) {
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i =0;
        StringBuilder builder = new StringBuilder();
        while (num>0){
            if (num>=n[i]){
                builder.append(s[i]);
                num-=n[i];
            } else{
                i++;
            }
        }
        return builder.toString();
    }
}

