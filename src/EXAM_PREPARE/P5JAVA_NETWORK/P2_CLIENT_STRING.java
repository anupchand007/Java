package EXAM_PREPARE.P5JAVA_NETWORK;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class P2_CLIENT_STRING {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 5000);

        DataInputStream dis = new DataInputStream(s.getInputStream());

        String msg = dis.readUTF();
        System.out.println("The Message from the server is "+ msg);

        s.close();
    }
}
