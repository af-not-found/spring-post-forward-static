package net.afnf.forward_test_boot.client;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpClientMain {

    public static void main(String[] args) {

        RequestConfig requestConfig = RequestConfig.custom().setRedirectsEnabled(true).build();
        HttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();

        InputStream inputStream = null;
        try {
            //HttpRequestBase req = new HttpGet("http://localhost:8080/prg");
            HttpRequestBase req = new HttpPost("http://localhost:8080/prg");
            HttpResponse response = client.execute(req);

            inputStream = response.getEntity().getContent();

            System.out.println(response.getStatusLine().getStatusCode());
            System.out.println(IOUtils.toString(inputStream));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            IOUtils.closeQuietly(inputStream);
            HttpClientUtils.closeQuietly(client);
        }
    }
}
