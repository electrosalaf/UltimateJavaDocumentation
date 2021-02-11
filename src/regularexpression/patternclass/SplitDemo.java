package regularexpression.patternclass;

import java.util.regex.Pattern;

public class SplitDemo {

    private static final String REGEX = ":";
    private static final String INPUT = "One:Two:Three:Four:Five";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        String[] items = pattern.split(INPUT);
        for (String s : items) {
            System.out.println(s);
        }
    }
}
