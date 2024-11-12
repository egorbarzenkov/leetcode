package AddStrings415;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
//        System.out.println(myMain.addStrings("3876620623801494171", "6529364523802684779")); //10405985147604178950
        System.out.println(myMain.addStrings("11", "123")); //10405985147604178950
    }

    public String addStrings(String num1, String num2) {
        int num1Index = num1.length() - 1;
        int num2Index = num2.length() - 1;
        StringBuilder builder = new StringBuilder();
        boolean isNeedTen = false;
        int res = 0;
        while (num2Index >= 0 || num1Index >= 0) {
            char char1 = '0';
            char char2 = '0';
            if (num1Index >= 0) {
                char1 = num1.charAt(num1Index);
            }
            if (num2Index >= 0) {
                char2 = num2.charAt(num2Index);
            }

            if (isNeedTen) {
                res++;
            }
            res += (char1 - 48) + (char2 - 48);
            if (res > 9) {
                isNeedTen = true;
                builder.append(res % 10);
            } else {
                isNeedTen = false;
                builder.append(res);
            }
            if (num2Index >= 0) {
                num2Index--;
            }
            if (num1Index >= 0) {
                num1Index--;
            }

            res = 0;
        }
        if (isNeedTen) {
            builder.append('1');
        }
        return builder.reverse().toString();
    }
}
