package EXAM_PREPARE.P1_CORE;

import java.util.Scanner;

class Car{
    String name;
    int price;
    String Model;

    void setInfo(String n, int p, String m){
        this.name = n;
        this.price = p;
        this.Model = m;
    }

    void showInfo(){
        System.out.println("The name of the car is " + this.name + ". It's price is " + this.price + ". The model is " + this.Model);
    }
}


public class P4_CLASS_and_OBJ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Car  c1 = new Car();
        System.out.println("Enter the Name of the Car: ");
        c1.name = s.nextLine();
        System.out.println("Enter the Price of the Car: ");
        c1.price = s.nextInt();
        s.nextLine();
        System.out.println("Enter the Model of the Car: ");
        c1.Model = s.nextLine();
        System.out.println("Processing...");
        c1.showInfo();
    }
}
