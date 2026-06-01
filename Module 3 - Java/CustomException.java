import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class CustomException {
    static void check(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age Invalid!");
        } else {
            System.out.println("Valid age!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        
        try {
            check(a);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}