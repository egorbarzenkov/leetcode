package BestTimeBuyAndSellStock121;

public class MyMain {

    public static void main(String[] args) {
        MyMain main = new MyMain();

        System.out.println(main.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(main.maxProfit(new int[]{7,6,4,3,1}));
    }

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            else if (prices[i] - min > max)
                max = prices[i] - min;
        }
        return max;
    }

//    public int maxProfit(int[] prices) {
//        int res = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                if (prices[j] - prices[i] > res) {
//                    res = prices[j] - prices[i];
//                }
//            }
//        }
//        return res;
//    }
}
