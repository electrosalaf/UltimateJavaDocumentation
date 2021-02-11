package basicio.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner scan = null;

        try {
            scan = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            while (scan.hasNext()) {
                System.out.println(scan.next());
            }
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
