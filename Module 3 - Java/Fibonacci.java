import java.util.*;
import java.io.*;

class Fibonacci{
    
    public static int fibo(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int f = fibo(num);
        System.out.println("The Fibonacci Number is: " + f);
    }
}