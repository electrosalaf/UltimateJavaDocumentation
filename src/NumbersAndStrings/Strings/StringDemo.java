package NumbersAndStrings.Strings;

public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        //  Put the original string in an array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        }
        //palindrome.getChars(0, len, tempCharArray, 0);

        //  Reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);

        /**String fs = String.format("The value of the float " +
                "variable is %f, while " +
                "the value of the " +
                "integer variable is %d, " +
                "and the string is %s",
                floatVar, intVar, stringVar);
        System.out.println(fs); */

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);
    }
}
