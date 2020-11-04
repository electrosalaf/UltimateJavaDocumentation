/**
 * A continue statement skips the current iteration of a for, while, or do-while loop.
 * The unlabeled form skips to the end of the innermost loop's body and evaluates the boolean expression that controls.
 * This program steps through a String, counting the occurrences of the letter "p"
 * If the current character is not a p, the continue statement skips the rest of the loop and proceed to the next character.
 */
package JavaBasics.ControlFlowStatements;

class ContinueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            if (searchMe.charAt(i) != 'p')                          // Interested only in p's
                continue;

            numPs++;                                               // process p's
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
