import java.util.*;
import java.io.*;

class MethodOverloading {
    
    public static int add(int a, int b){
        return a+b;
    }
    
    public static double add(double a, double b){
        return a+b;
    }
    
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(add(2,5));
        System.out.println(add(4.2,2.4));
        System.out.println(add(2,3,5));
        
    }
}