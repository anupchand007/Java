package EXAM_PREPARE;

import java.util.Scanner;

public class P9_TRY_CATCH_EXCEPTION {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(b == 0){
                throw new Exception("Cannot Divided by Zero (0)");
            }
            System.out.println("The result is " + a/b);
        }catch(ArithmeticException e) {
            System.out.println("A Arithmetic Error occured: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Error Occured :" + e.getMessage());
        }finally {
            System.out.println("The code has been executed");
        }
    }
}
