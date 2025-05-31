public class Loops {
    public static void main(String[] args) {
        String name = "Anup Chand";
        int a = 10;
        int b = 15;

        for (int i = 0; i <= 5; i++) {
            System.out.println(name);
        }


        int age = 18;
        while (age <= 25) {
            System.out.println("Too Young for Marriage");
            age++;
        }

        int time = 11;
        do {
            System.out.println("Not the time for lunch");
            time++;
        } while (time <= 13);

        int myResult = a > b ? a : b;
        System.out.println(myResult);
    }

}

