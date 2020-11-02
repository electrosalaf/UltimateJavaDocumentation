package JavaBasics;

class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Lancelot"}
        };

        System.out.println(names[0][0] + names[1][0]);          // prints out Mr. Smith
        System.out.println(names[0][2] + names[1][1]);         //  prints out Ms. Lancelot

        System.out.println(names.length);                     // prints the length of the array to standard output
    }
}
