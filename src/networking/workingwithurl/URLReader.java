package networking.workingwithurl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://www.oracle.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();


        try {
            URL siteURL = new URL("http://www.islamicvibes.com/");
            URLConnection siteURLConnection = siteURL.openConnection();
            siteURLConnection.connect();
        } catch (MalformedURLException e) {

        } catch (IOException e) {

        }
    }
}

