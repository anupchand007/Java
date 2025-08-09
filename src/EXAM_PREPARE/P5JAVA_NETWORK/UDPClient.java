package EXAM_PREPARE.P5JAVA_NETWORK;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String msg = "Hello Server";
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), ip, 1234);
        ds.send(dp);
        ds.close();
    }
}
