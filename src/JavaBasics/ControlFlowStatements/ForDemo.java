/**
 * If variable that controls a for statement is needed outside the loop: Best practice is declare it in the Initialization expression.
 * Defining loop control variables(i, j, k) in the initialization expression limits their lifespan and reduce errors.
 * The 3 expressions in loop(initialization, termination, increment) are optional for Infinite loops.
 */
package JavaBasics.ControlFlowStatements;

class ForDemo {
    public static void main(String[] args) {
        for (int i=1; i<11; i++) {
            System.out.println("Count is: " + i);
        }
    }
}
