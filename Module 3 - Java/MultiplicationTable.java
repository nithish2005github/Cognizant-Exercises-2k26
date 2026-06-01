import java.util.*;
import java.io.*;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i=1;i<21;i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}