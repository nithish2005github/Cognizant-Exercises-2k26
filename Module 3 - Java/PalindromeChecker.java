import java.util.*;
import java.io.*;

class PalindromeChecker{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        String ori = sc.nextLine();
        
        String clean = ori.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(clean).reverse();
        String rev = sb.toString();
        
        if(rev.equals(clean)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It  is not a palindrome");
        }
        sc.close();
    }
}