package EXAM_PREPARE;

import java.io.*;

class Student implements Serializable{
    String name;
    int age;

    Student(String Name, int Age){
        name = Name;
        age = Age;
    }
}

public class P17_SERALIZATION {
    public static void main(String[] args) {
        Student s1 = new Student("Anup Chand", 22);

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(s1);

            out.close();
            System.out.println("Object Saved to File...");
        }catch (IOException e){
            e.printStackTrace();
        }

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
            Student s2 = (Student) in.readObject();

            System.out.println("Object read from file: \n");
            System.out.println("Name is " + s2.name);
            System.out.println("Age io " + s1.age);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
