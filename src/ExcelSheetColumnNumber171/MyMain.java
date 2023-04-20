package ExcelSheetColumnNumber171;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
        System.out.println(main.titleToNumber("A"));
        System.out.println(main.titleToNumber("AB"));
        System.out.println(main.titleToNumber("ZY"));
    }
    public int titleToNumber(String columnTitle) {
//        int res = 0;
//        for (int i = columnTitle.toCharArray().length -1; i >= 0 ; i--) {
//            res += (columnTitle.charAt(i) - 64) * (Math.pow(26,columnTitle.toCharArray().length -1 - i ));
//        }
//        return res;
        int sum=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            sum=(sum*26)+(columnTitle.toUpperCase().charAt(i)-'A'+1);
        }
        return sum;
    }
}
