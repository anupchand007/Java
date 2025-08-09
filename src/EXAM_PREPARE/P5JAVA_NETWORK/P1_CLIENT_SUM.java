package EXAM_PREPARE.P5JAVA_NETWORK;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class P1_CLIENT_SUM {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 5000);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        int number = 7;
        dos.writeInt(number);

        int result = dis.readInt();
        System.out.println("The Square of " + number + " is " + result );

        s.close();
    }
}
