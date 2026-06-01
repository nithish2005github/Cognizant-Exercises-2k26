import java.util.*;
import java.io.*;

class Casting {
    public static void main(String[] args) {
        
        double dnum = 6.98d;
        System.out.println("The Double Value is: "+ dnum);
        int inum = (int) dnum;
        System.out.println("After casting it to int: "+ inum);
        
        int inumm = 97;
        System.out.println("The Integer Value is: "+ inumm);
        double dnumm = (double) inumm;
        System.out.println("After casting it to double: "+ dnumm);
        
    }
}