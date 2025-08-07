package EXAM_PREPARE.P1_CORE;

public class P10_THROWS {
    public static void checkAge(int age) throws Exception{
        if(age < 18){
            throw  new Exception("Age is not reached");
        }
        System.out.println("We welcome you!!!");
    }

    public static void main(String[] args) {
        try{
            checkAge(19);
        }catch (Exception e){
            System.out.println("Error Occured: " + e.getMessage());
        }
    }
}
