import java.util.*;
import java.io.*;

class ArraySum{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        System.out.println("Enter the elements: ");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        double avg = 0;
        for(int i =0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        avg = (double) sum / arr.length;
        
        System.out.println("The sum of Array elements is: "+ sum);
        System.out.printf("The Average of Array Elements is: %.2f%n", avg);
    }
}