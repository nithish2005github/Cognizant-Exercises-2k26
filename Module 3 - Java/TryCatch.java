import java.util.*;
import java.io.*;

public class TryCatch{
    
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
          System.out.println("Enter the values to divide:");
          int a = sc.nextInt();
          int b = sc.nextInt();
          System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero error!");
        }
    }
}
