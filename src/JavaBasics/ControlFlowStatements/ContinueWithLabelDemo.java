/**
 * A labeled continue statement skips the current iteration of an outer loop marked with the given label.
 * The program uses nested loops to search for a substring within another substring.
 * Two nested loops are required: one to iterate over the substring and the other to iterate over the string being searched.
 * Return statement exits from the current method, and control flows return to where  the method is invoked
 * Return statement has two forms: One that returns a value, and the other that doesn't.
 * To return a value, simply put the value (or the expression that calculates the value) after the return keyword (e.g return ++count;)
 * The data type of the returned value must match the type of the method's declared return value.
 * When a method is declared void, use the form of return that doesn't return a value (return;)
 */

package JavaBasics.ControlFlowStatements;

class ContinueWithLabelDemo {
    public static void main(String[] args) {

        String searchMe = "Look for a string in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - substring.length();

        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}
