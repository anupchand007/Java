package EXAM_PREPARE.P5JAVA_NETWORK;

import java.net.*;
import java.io.*;
import java.nio.Buffer;

public class P4_URL_READER {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.youtube.com/watch?v=Ae-r8hsbPUo");
        URLConnection conn = url.openConnection();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()
                )
        );
        String line;
        while ((line = reader.readLine()) != null ){
            System.out.println(line);
        }
    }
}
