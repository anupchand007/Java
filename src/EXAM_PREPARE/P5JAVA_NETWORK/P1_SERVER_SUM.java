package EXAM_PREPARE.P5JAVA_NETWORK;


import java.io.*;
import java.net.*;

public class P1_SERVER_SUM {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();
        System.out.println("Server has been Started....");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        int number = dis.readInt();
        int square = number * number;
        dos.writeInt(square);

        s.close();
        ss.close();

    }

}
