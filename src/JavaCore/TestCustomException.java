package JavaCore;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class TestCustomException {
    static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("You are underage");
        }
        System.out.println("You are Eligible");
    }

    public static void main(String[] args){
        try{
            checkAge(7);
        }catch (InvalidAgeException e){
            System.out.println("Caught: "+ e.getMessage());
        }
    }
}
