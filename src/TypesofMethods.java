public class TypesofMethods {

    //1. No Parameter No return Type
    public static  void printMe(){
        System.out.println("Hello My name is Anup Chand");
    }

    //2. Parameter but No return Type
    public static void myBrand(String brand){
        System.out.println("The Brand of My Laptop is :" + brand);
    }

    //3. Parameter with Return Type
    public static int myAge(int age){
        return age;
    }

    //4. No Parameter with return type
    public static String myInfo(){
        String greeting = "Hello It's me Anup Chand";
        return greeting;
    }

    public static void main(String[] args) {
        printMe();
        myBrand("Acer");
        System.out.println("My Age is "+ myAge(22));
        System.out.println(myInfo());
    }
}
