public class Variables {
    public static  void main(String[] args){
        String name = "Anup Chand";
        int age = 22;
        double pi = 3.14;
        String Address = "Kalanki, KTM";
        boolean isSexy = true;
        char gender = 'G'; //should be kept in single quote
        final String nationality = "Nepali";  // to create a constant variable

        System.out.println("Hello My name is " +name);
        System.out.println("I am " +age + "years old. Any My Nationality is " +nationality);
        System.out.println("The value of the PI is " + pi);

        name = "Anup Ojha";
//        nationality = "American";
        System.out.println("Hello My name is " +name);
    }
}
