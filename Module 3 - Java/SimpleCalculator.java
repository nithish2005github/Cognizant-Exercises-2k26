import java.io.*;
import java.util.Scanner;
class SimpleCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        System.out.println("Enter another number: ");
        b = sc.nextInt();
        
        System.out.println("Choose an operator: + or - or *  or /");
        String opr = sc.next();
        
        int sol = 0;
        
        switch(opr) {
            case "+":
                sol = a+b;
                System.out.println("The sum is: "+ sol);
                break;
            
            case "-":
                sol = a-b;
                System.out.println("The difference is: "+ sol);
                break;
                
            case "*":
                sol = a*b;
                System.out.println("The product is: "+ sol);
                break;
                
            case "/":
                if(b == 0){
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                sol = a/b;
                System.out.println("The quotient is: "+ sol);
                break;
            
            default:
                System.out.println("Error: Invalid Operator");
                return;
        }
        
        sc.close();
        
        
    }
}