/**
 * This for statement is an enhance design pattern to iterate through Collections and Arrays.
 * When possible, using this form of for statement is better than the general form.
 * This form of for statement is more compact and clean.
 */
package JavaBasics.ControlFlowStatements;

class EnhancedForDemo {
    public static void main(String[] args) {
        int[] numbers =
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }
}
