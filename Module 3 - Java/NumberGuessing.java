import java.util.*;
import java.io.*;

class NumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int num = rand.nextInt(100) + 1;
        int guess = 0;
        
        System.out.println("Guess the number;(1 - 100) ");
        
        while (guess != num){
            System.out.print("Enter the guess: ");
            guess = sc.nextInt();
            int diff = Math.abs(guess - num);
            
            
            if(guess < num){
                if(diff > 15){
                    System.out.println("Your guess is too low.");
                }
                else{
                    System.out.println("Your guess is low.");
                }
            }
            else if(guess > num){
                if(diff > 15){
                    System.out.println("Your guess is too high.");
                }
                else{
                    System.out.println("Your guess is high.");
                }
            }
            else{
                System.out.println("Your Guess is right!");
            }
        }
        sc.close();
    }
}