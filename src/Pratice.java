import java.util.Scanner;

public class Pratice {

    public static void main(String[] args) {

        // 1. Write a program to print your name in Java.
       /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Full name: ");
        String name = sc.nextLine();
        System.out.println("The User name is " + name);
       */


        // 2. Write a program that finds simple interest. Formula= (p * t * r) / 100
         //int principal = 500;
         //int time = 6;
         //double rate = 4.5;

      /*  Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the Principal, Time and Rate");
        int principal = sc.nextInt();
        int time = sc.nextInt();
        double rate = sc.nextDouble();

        System.out.println("Calculating Simple Interest (SI)");
        double SI = (principal * time * rate) / 100;
        System.out.println("The SI is " + SI);

      */

//    3. Write a program to find the quotient and remainder of two Integers

        /*
        int FirstNumber  = 22;
        int SecondNumber = 10;

        int Quotient = FirstNumber/SecondNumber;
        int Reminder = FirstNumber%SecondNumber;

        System.out.println("The Quotient is "+ Quotient);
        System.out.println("The Reminder is "+ Reminder);

         */

// 4.Write a program to swap two numbers.

        /*
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the any two numbers:");
        int Num1 = sc.nextInt();
        int Num2= sc.nextInt();
        System.out.println("Before Swapping Numbers \nFirst Number :"+ Num1 + " and Second Number: "  + Num2);
        System.out.println("Swapping the numbers: ");
        temp = Num1;
        Num1 = Num2;
        Num2 = temp;

        System.out.println("After Swapping Numbers \nFirst Number :"+ Num1 + " and Second Number: "  + Num2);

         */

      //  5. Write a program to remove all whitespaces from the String.


        String name = "      Anup Chand      ";
        System.out.println(name);
        System.out.println(name.trim());


        String Number = "980";
        int ConvertedInt  = Integer.parseInt(Number);
        System.out.println(ConvertedInt);


    }

}
