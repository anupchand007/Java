package EXAM_PREPARE;


class invalidAge extends Exception{
    public invalidAge(String message){
        super(message);
    }
}

public class P11_CUSTOM_EXPECTION {
    static  void checkAge(int Age) throws invalidAge{
        if(Age < 18){
            throw new invalidAge("You are underAge");
        }else{
            System.out.println("Welcome to our Beautiful World!!");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(16);
        }catch (invalidAge e){
            System.out.println("Error Occured " + e.getMessage());
        }
    }
}
