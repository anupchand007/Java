import javax.print.attribute.standard.PrinterName;

public class Methods {
    public static void main(String[] args) {
        PrintNames("Anup Chand");
        printData();
        addNums(2,54);
        System.out.println(addNums(2,54));;
    }

    public static void PrintNames(String name){
        System.out.println("Welcome Dear User "+ name);
    }

    public static void printData(){
        System.out.println("This is a Method");
    }

    public static int addNums(int a, int b){
//        System.out.println("The sum of "+ a + " and "+ b+ " = " +(a + b));
        return a + b;
    }
}


// Types of Methods in Java
// Pre-Build Method (System, Main, etc etc)
// User Define Method