package regularexpression.matcherclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDemo {

    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. All dogs say meow.";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        INPUT = matcher.replaceAll(REPLACE);
        System.out.println(INPUT);
        System.err.println("The output has an error");
    }
}
