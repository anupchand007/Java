package EXAM_PREPARE.P5JAVA_NETWORK;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] buffer = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        ds.receive(dp);
        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Client says: " + msg);
        ds.close();
    }
}
