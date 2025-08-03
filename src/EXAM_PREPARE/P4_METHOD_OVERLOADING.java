package EXAM_PREPARE;

class Calculator{
    public int Add(int a, int b){
        return a + b ;
    }

    public void AddName(String a, String b){
        System.out.println("The full name is " + a + b );
    }

    public double Add(double a, double b){
        return a + b ;
    }

}

public class P4_METHOD_OVERLOADING {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.Add(2,3));;

        System.out.println(c.Add(3.14, 2.32));
        ;c.AddName("Anup", "Chand");
    }

}
