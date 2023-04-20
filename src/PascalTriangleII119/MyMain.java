package PascalTriangleII119;

import java.util.Arrays;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        main.getRow(30).forEach(System.out::println);
        main.getRow(5).forEach(System.out::println);
    }

    public List<Integer> getRow(int rowIndex) {
        Integer[] list = new Integer[rowIndex + 1];

        list[0] = 1; //First element is always 1
        for (int i = 1; i < rowIndex / 2 + 1; i++) { //Progress up, until reaching the middle value
            list[i] = list[i - 1] * (rowIndex - i + 1) / i;
        }
        for (int i = rowIndex / 2 + 1; i <= rowIndex; i++) { //Copy the inverse of the first part
            list[i] = list[rowIndex - i];
        }
        return Arrays.asList(list);
    }
}
