package EXAM_PREPARE.P1_CORE;

import java.io.IOException;
import java.io.RandomAccessFile;

public class P16_RANDOMACCESSFILE {
    public static void main(String[] args) {
        try{
            RandomAccessFile raf = new RandomAccessFile("file.txt", "rw");

            raf.writeUTF("Hello Anup");
            raf.writeInt(22);

            raf.seek(0);

            String text = raf.readUTF();
            int age = raf.readInt();

            System.out.println("My text is "+ text);
            System.out.println("Age is " + age);

            raf.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
