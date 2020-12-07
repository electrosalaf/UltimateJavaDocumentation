package basicio.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
        public static void main(String[] args) throws IOException {

            FileInputStream input = null;
            FileOutputStream output = null;

            try {
                input = new FileInputStream("xanadu.txt");
                output = new FileOutputStream("outagain.txt");

                int c;
                while ((c = input.read()) != -1) {
                    output.write(c);
                }
            } finally {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            }
        }
}

