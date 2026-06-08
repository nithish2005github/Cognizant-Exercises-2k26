import java.util.*;
import java.io.*;

class Precedence {
    public static void main(String[] args) {
        
        int sol = 9*8+5/2-7%2;
        System.out.println("The Expression is: 9*8+5/2-7%2");
        System.out.println("The Solution is: " + sol);
        System.out.println("Order of Operations:\n" +
                   "1. 9 * 8 = 7     (Multiplication)\n" +
                   "2. 5 / 2 = 2     (Integer Division drops decimals)\n" +
                   "3. 7 % 2 = 1     (Modulo/Remainder)\n" +
                   "4. 72 + 2 = 74   (Addition)\n" +
                   "5. 74 - 1 = 73   (Subtraction)");
        
    }
}