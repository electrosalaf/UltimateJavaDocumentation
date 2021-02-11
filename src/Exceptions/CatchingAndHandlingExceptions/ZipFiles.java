package Exceptions.CatchingAndHandlingExceptions;

import java.nio.charset.StandardCharsets;
import java.sql.*;

public class ZipFiles {

    public static void writeToFileZipFileContent(String zipFileName,
                                                 String outputFileName) throws java.io.IOException {
        java.nio.charset.Charset charset = StandardCharsets.US_ASCII;
        java.nio.file.Path outputFilePath = java.nio.file.Paths.get(outputFileName);

        //  Open zip file and create output file with try-with resources statement

        try (
                java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName);
                java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset);
                ) {
            //  Enumerate each entry
            for (java.util.Enumeration entries = zf.entries(); entries.hasMoreElements();) {
                //  Get entry name and write it to the output file
                String newLine = System.getProperty("line.separator");
                String zipEntryName = ((java.util.zip.ZipEntry)entries.nextElement()).getName() + newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
    }

    //  This try-with-resources statement automatically close a java.sql.Statement object
    public static void viewTable(Connection con) throws SQLException {

        String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

        try (Statement stmt = con.createStatement()){
            ResultSet resultSet = stmt.executeQuery(query);

            while (resultSet.next()) {
                String coffeeName = resultSet.getString("COF_NAME");
                int supplierID = resultSet.getInt("SUP_ID");
                float price = resultSet.getFloat("PRICE");
                int sales = resultSet.getInt("SALES");
                int total = resultSet.getInt("TOTAL");

                System.out.println(coffeeName + ", " + supplierID + ", " + price + ", " + sales + ", " + total);
            }
        } catch (SQLException e) {
            //JDBCType.printSQLException(e);
        }

    }
}
