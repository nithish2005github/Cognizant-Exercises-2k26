import java.util.*;
import java.io.File;
import java.io.FileWriter;

class FileWriting{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String string = sc.nextLine();
            File f = new File("output.txt");    
            try (FileWriter fw =  new FileWriter(f)){
            fw.write(string);
            }
            System.out.println("Successfully written to the file!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}