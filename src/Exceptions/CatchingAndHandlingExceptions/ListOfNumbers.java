package Exceptions.CatchingAndHandlingExceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers() {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    /**
     * A try-with-resources statement declares one or resources, a try-with-resources statement ensures that the resource is closed
     * at the end of the statement
     * resource is an object that must be closed after the program is finished with it
     * @param path
     * @return
     * @throws IOException
     */
    static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            if (br != null) br.close();
        }
    }

    public void writeList() {
        //  The FileWriter construction throws IOException, which must be caught.
        PrintWriter out = null;
        try {
            System.out.println("Enter try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < SIZE; i++) {
                //  The get(int) method throws IndexOutOfBoundException, which must be caught.
                out.println("Value at: " + i + " = " + list.get(i));
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundException: " + e.getMessage());

        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());

        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

}
