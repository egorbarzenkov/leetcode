package ExcelSheetColumnTitle168;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        System.out.println(main.convertToTitle(1));
        System.out.println(main.convertToTitle(52));
//        System.out.println(main.convertToTitle(27));
//        System.out.println(main.convertToTitle(701));
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder ss = new StringBuilder();

        while(columnNumber > 0){
            columnNumber -= 1;
            ss.insert(0, (char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return ss.toString();
    }
}
