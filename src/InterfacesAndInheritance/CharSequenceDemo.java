package InterfacesAndInheritance;

//  CharSequenceDemo presents a String value --backwards.
public class CharSequenceDemo implements CharSequence {
    private String string;

    public CharSequenceDemo(String s) {
        this.string = string;
    }

    //  If the string is backwards, the end is the beginning!
    private int fromEnd(int i) {
        return string.length() - 1 - i;
    }

    public char charAt(int i) {
        if ((i < 0) || (i >= string.length())) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return string.charAt(fromEnd(i));
    }

    public int length() {
        return string.length();
    }

    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > string.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        StringBuilder sub = new StringBuilder(string.subSequence(fromEnd(end), fromEnd(start)));
        return sub.reverse();
    }

    public String toString() {
        StringBuilder string = new StringBuilder(this.string);
        return string.reverse().toString();
    }

    //  Random int from 0 to max. As random generates values between 0 and 0.9999
    private static int random(int max) {
        return (int) Math.round(Math.random() * (max+1));
    }

    public static void main(String[] args) {
        CharSequenceDemo string = new CharSequenceDemo("Write a class that implements the CharSequence interface found in the java.lang package.");

        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }

        System.out.println("");

        //  Exercise subSequence and length();
        int start = random(string.length() - 1);
        int end = random(string.length() - 1 - start) + start;
        System.out.println(string.subSequence(start, end));

        //  Exercise toString();
        System.out.println(string);
    }
}
