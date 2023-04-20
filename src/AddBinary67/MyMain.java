package AddBinary67;

public class MyMain {
    public static void main(String[] args) {
        MyMain main = new MyMain();
//        System.out.println(main.addBinary("11", "1"));
        System.out.println(main.addBinary("1111", "1111"));
//        System.out.println(main.addBinary("1111", "1111"));
//        System.out.println(main.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
//                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    public String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        boolean plusOne = false;
        char[] firstChars;
        char[] twoChars;
        if (aLength > bLength) {
            firstChars = a.toCharArray();
            twoChars = makeEqualsLength(aLength - bLength, b.toCharArray());
        } else if (aLength < bLength) {
            firstChars = b.toCharArray();
            twoChars = makeEqualsLength(bLength - aLength, a.toCharArray());
        } else {
            firstChars = a.toCharArray();
            twoChars = b.toCharArray();
        }
        for (int i = firstChars.length - 1; i >= 0; i--) {
            if (firstChars[i] == '1' && twoChars[i] == '1') {
                if (plusOne) {
                    firstChars[i] = '1';
                } else {
                    firstChars[i] = '0';
                    plusOne = true;
                }
            } else if (firstChars[i] == '1' || twoChars[i] == '1') {
                if (plusOne) {
                    firstChars[i] = '0';
                } else {
                    firstChars[i] = '1';
                }
            } else {
                if (plusOne) {
                    firstChars[i] = '1';
                    plusOne = false;
                } else {
                    firstChars[i] = '0';
                }
            }
        }
        if (plusOne) {
            char[] chars = new char[firstChars.length + 1];
            chars[0] = '1';
            for (int i = 0; i < firstChars.length; i++) {
                chars[i + 1] = firstChars[i];
            }
            return String.valueOf(chars);
        } else {
            return String.valueOf(firstChars);
        }
    }

    private char[] makeEqualsLength(int index, char[] chars) {
        char[] charsRes = new char[chars.length + index];
        for (int i = 0; i < chars.length + index; i++) {
            if (i < index) {
                charsRes[i] = '0';
            } else {
                charsRes[i] = chars[chars.length + i - (chars.length + index)];
            }
        }
        return charsRes;
    }
}
