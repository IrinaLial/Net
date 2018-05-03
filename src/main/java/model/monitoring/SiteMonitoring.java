package model.monitoring;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.function.Predicate;

public class SiteMonitoring {
    public static void main(String[] args) throws IOException {
//   String site = "https://github.com";
//        URL url = new URL(site);
//        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//       System.out.println(connection.getRequestMethod());
//        System.out.println(connection.getResponseCode());

//        System.out.println("Type your facebook link:");
//        Scanner scanner = new Scanner(System.in);
//        String link = scanner.next();
//        if(!site.startsWith("https://")){
//            site = "https://" + site;
//        }
//      final URL url = new URL(site);
//        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        System.out.println(connection.getRequestMethod());
//        System.out.println(connection.getResponseCode());
    }

    public void monitoring(String site) throws IOException {
        if (!site.startsWith("https://")) {
            site = "https://" + site;
        }
        final URL url = new URL(site);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        System.out.println(connection.getResponseMessage());
        System.out.println(connection.getResponseCode());

    }
}
