package NumbersAndStrings.Strings;

public class ComputeInitials {
    public static void main(String[] args) {
        String myName = "Ibrahim A. Lawal";
        StringBuffer myInitials = new StringBuffer();
        int length = myName.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
            }
        }
        System.out.println("My initials are: " + myInitials);
    }
}
