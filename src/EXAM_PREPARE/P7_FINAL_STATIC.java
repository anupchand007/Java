package EXAM_PREPARE;


public class P7_FINAL_STATIC {
    static void me(){
            System.out.println("This is me....");
    }
    public static void main(String[] args) {
        final int age = 18;
        if(age < 18){
            System.out.println("The content is restricted for you");
        }else{
            System.out.println("Welcome to the world of unseen");
        }
//        age = 19;
        me();
    }
}
