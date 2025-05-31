public class array {

    public static void main(String[] args) {
        int [] ages = {22, 33, 55, 66};
        System.out.println(ages[1]);
        System.out.println(ages[0]);
        System.out.println(ages[3]);

        ages[3] = 24;
        ages[1] = 54;
        ages[0] = 784;

        System.out.println(ages[1]);
        System.out.println(ages[0]);
        System.out.println(ages[3]);

        System.out.println("The length of the array is :"+ages.length);


        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        String [] names = {"Anup", "Bimal", "Sumit", "Ananta", "Bimal"};
        for(String item : names){
            System.out.println("The name of the user is " +item);
        }

        int [] num = {1,2,3,4,5};
            int total = 0;
        for(int i: num){
            total += i;
        }
            System.out.println("The sum of total value is " +total);

        System.out.println("The Average of the array is "+ total/5);
    }
}
