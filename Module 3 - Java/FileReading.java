import java.util.*;
import java.io.File;

class FileReading{
    public static void main(String[] args){
        try{
            File f = new File("output.txt");
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}