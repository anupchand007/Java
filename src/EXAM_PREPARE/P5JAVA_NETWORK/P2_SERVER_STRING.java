package EXAM_PREPARE.P5JAVA_NETWORK;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class P2_SERVER_STRING {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        String msg = "Hello Dear user, Welcome to Java Network!!!";
        dos.writeUTF(msg);

        System.out.println("Server is Running.....");

        s.close();
        ss.close();
    }
}
