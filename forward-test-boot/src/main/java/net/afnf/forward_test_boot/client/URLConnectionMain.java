package net.afnf.forward_test_boot.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class URLConnectionMain {

    public static void main(String[] args) {

        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            URL url = new URL("http://localhost:8080/prg");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setDoOutput(true);
            outputStream = connection.getOutputStream();
            IOUtils.write("test", outputStream);

            inputStream = connection.getInputStream();

            System.out.println(connection.getResponseCode());
            System.out.println(IOUtils.toString(inputStream));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(outputStream);
        }
    }
}
