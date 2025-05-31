
public class Operators {
    public static void main(String[] args) {
        int a = 96;
        a++;        //incrementing the value of a
        a += 4;       // adding the 4 on the default value of a i.e 97 after line 4
        int b = 6;
        b--;         //decrementing the value of b
        int c = 21;


        System.out.println(a);
        System.out.println(b);
        System.out.println("Result is " + (a + b));

        String Name = "Anup Chand";
        int Age = 18;

        System.out.println(a == Age);
        System.out.println(c == Age);
        System.out.println(500 == 500);
        System.out.println(52 >= 500);
        System.out.println(523 <= 500);
        System.out.println(504 % 500);

        if (a == 101 && Age == 18) {
            System.out.println("Weleconme");
        } else {
            System.out.println("Bakk Sala");
        }
    }
}
