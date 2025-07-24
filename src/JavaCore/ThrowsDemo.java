package JavaCore;

public class ThrowsDemo {
    // This method declares that it might throw an Exception
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            // Manually throw a new exception
            throw new Exception("Access denied: You must be at least 18 years old.");
        }
        System.out.println("Access granted.");
    }

    public static void main(String[] args) {
        try {
            // The caller must handle the exception declared by checkAge()
            checkAge(1);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}