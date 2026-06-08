import java.util.*;
import java.io.*;

class StringReversal{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String ori = sc.nextLine();
        StringBuilder sb = new StringBuilder(ori);
        String rev = sb.reverse().toString();
        System.out.println("The reversed string is: " + rev);
    }
}