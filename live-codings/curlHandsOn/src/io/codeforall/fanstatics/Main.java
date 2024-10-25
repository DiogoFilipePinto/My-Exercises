package io.codeforall.fanstatics;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        String urlStr =  "https://www.google.com";
        BufferedInputStream reader = null;

        try {
            URL url = new URL(urlStr);
            InputStream inputStream = url.openStream();
            reader = new BufferedInputStream(inputStream);

            int c;
            while((c = reader.read()) != -1){
                System.out.print((char) c);
            }

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }finally {

            try {
                if(reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
