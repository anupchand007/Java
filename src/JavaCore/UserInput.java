import java.util.Scanner;   //to take input from the user we import this library
public class UserInput {

    public static void main(String[] args) {

        //malking scanner opbject
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int num1 = scan.nextInt();      //nextInt() for taking Integer
        System.out.print("Enter 2st Number:");
        int num2 = scan.nextInt();
        int result  = num1 + num2 ;
        System.out.println(result);



        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Your First Name:");
        String FirstName = Input.nextLine(); //nextInt() for taking String
        System.out.print("Enter Your Last Name:");
        String LastName = Input.nextLine();
        String Fullname = FirstName + LastName;
        System.out.println(Fullname);

        //nextBoolean()
        //nextDouble()
        //nextFloat()
        //nextInt()
        //nextLine()
    }

}
