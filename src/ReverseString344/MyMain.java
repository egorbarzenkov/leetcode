package ReverseString344;

public class MyMain {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        MyMain main = new MyMain();
        main.reverseString(chars);
        System.out.println(chars);
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length -1 -i];
            s[s.length -1 -i] = temp;
        }
    }
}
