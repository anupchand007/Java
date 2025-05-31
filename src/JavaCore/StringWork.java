public class StringWork {
    public static void main(String[] args) {
        String Country = "Nepal";
        String Captial  = "Kathmandu";

        System.out.println(Country.length());
        System.out.println(Country.toUpperCase());
        System.out.println(Country.toLowerCase());
        System.out.println(Country.concat(Captial));

        if(Captial.equals("Kathmaduu")){
            System.out.println("Welcome to Nepal");
        }else{
            System.out.println("You are not in nepal");
        }
    }
}
