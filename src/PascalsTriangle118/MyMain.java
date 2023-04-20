package PascalsTriangle118;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        main.generate(100).forEach(System.out::println);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>(i + 1);
            list.add(0, 1);
            if (i >= 1) {
                if (i > 1) {
                    for (int j = 0; j < i - 1; j++) {
                        list.add(j + 1, mainList.get(i - 1).get(j) + mainList.get(i - 1).get(j + 1));
                    }
                }
                list.add(i, 1);
            }
            mainList.add(list);
        }
        return mainList;
    }
}
