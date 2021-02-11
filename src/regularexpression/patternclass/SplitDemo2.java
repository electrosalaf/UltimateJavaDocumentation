package regularexpression.patternclass;

import java.util.regex.Pattern;

public class SplitDemo2 {

    private static final String REGEX = "\\d";
    private static final String INPUT = "One9Two4Three7Four1five";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        String[] items = pattern.split(INPUT);
        for (String s : items) {
            System.out.println(s);
        }

    }
}
