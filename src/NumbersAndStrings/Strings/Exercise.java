package NumbersAndStrings.Strings;

public class Exercise {

    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        hannah.charAt(15);

        System.out.println("Was it a car or a cat I saw?".substring(9, 12));

        String hi = "Hi";
        String mom = "mom";

        hi.concat(mom);
    }
}
