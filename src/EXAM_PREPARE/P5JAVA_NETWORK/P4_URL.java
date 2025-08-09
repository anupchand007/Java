package EXAM_PREPARE.P5JAVA_NETWORK;

import java.net.*;

public class P4_URL {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://chatgpt.com/c/6896e388-7448-8331-b771-749cf28bbf04");
        System.out.println("Protocol: "+ url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port "+url.getPort());
        System.out.println("Port "+url.getPort());
    }
}
