package EXAM_PREPARE;

import java.io.*;


public class P15_CHARACTER_STREAM {
    public static void main(String[] args) {
        try{
            FileWriter writing = new FileWriter("Output.txt");
            writing.write("Hello, Anup Chand \n");
            writing.write("File Handling is easy");

            writing.close();

            FileReader reading = new FileReader("Output.txt");
            BufferedReader br = new BufferedReader(reading);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();
            reading.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
