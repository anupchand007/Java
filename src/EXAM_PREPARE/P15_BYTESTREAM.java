package EXAM_PREPARE;

import java.io.*;

public class P15_BYTESTREAM {
    public static void main(String[] args) {
        try{
            FileInputStream in = new FileInputStream("C:\\Users\\PrimeUser\\IdeaProjects\\Java\\src\\EXAM_PREPARE\\Source.txt");
            FileOutputStream out = new FileOutputStream("Copied.txt");

            int byteData;
            while((byteData = in.read()) != -1){
                out.write(byteData);
            }

            in.close();
            out.close();
            System.out.println("File copied using Byte Stream");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
