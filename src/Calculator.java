public class Calculator {
    public static void main(String[] args){
        int a = 5;
        int b = 10;

        int sum = a + b;
        int mul = a * b;
        int div = b / a;
        int sub = a - b;
        int mod = a % b;

        System.out.println("The result is "+ sum);
        System.out.println("The result is "+ mul);
        System.out.println("The result is "+ div);
        System.out.println("The result is "+ sub);
        System.out.println("Mod result is "+ mod);

    }
}
