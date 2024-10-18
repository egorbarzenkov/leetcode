package ReverseVowelsOfString345;

public class MyMain {
    public static void main(String[] args) {

    }

    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
//        String vowels = "aeiouAEIOU";
        while (start < end) {
//            while (start < end && vowels.indexOf(word[start]) == -1) {
            while (start < end && !isReversChar(word[start])) {
                start++;
            }

//            while (start < end && vowels.indexOf(word[end]) == -1) {
            while (start < end && !isReversChar(word[end])) {
                end--;
            }
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }
        String answer = new String(word);
        return answer;
    }

    boolean isReversChar(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }
}
