package FizzBuzz412;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.fizzBuzz(3));
        System.out.println(myMain.fizzBuzz(5));
        System.out.println(myMain.fizzBuzz(15));
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        System.gc();
        return list;
    }
}
