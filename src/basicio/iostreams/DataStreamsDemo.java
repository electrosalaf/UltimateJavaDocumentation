package basicio.iostreams;

import java.io.*;

public class DataStreamsDemo {

    static final String dataFile = "invoicedata";

    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] desc = {
            "Java T-Shirt",
            "Java Mug",
            "Java Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    public static void main(String[] args) throws IOException {
        DataInputStream inputStream = null;
        DataOutputStream outputStream = null;

        outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

        for (int i = 0; i < prices.length; i++) {
            outputStream.writeDouble(prices[i]);
            outputStream.writeInt(units[i]);
            outputStream.writeUTF(desc[i]);
        }

        inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));

        double price;
        int unit;
        String desc;
        double total = 0.0;

        try {
            while (true) {
                price = inputStream.readDouble();
                unit = inputStream.readInt();
                desc = inputStream.readUTF();
                System.out.format("You ordered %d" + " units of %s at $%.2f%n", unit, desc, price);
                total += unit * price;
            }
        } catch (EOFException e) {

        }

    }
}
