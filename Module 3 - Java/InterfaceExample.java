import java.util.*;
import java.io.*;

public class InterfaceExample{
    
    public static void main(String[] args) {
        
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        
        guitar.play();
        piano.play();
        
    }
}

interface Playable{
    void play();
}

class Guitar implements Playable {
    
    @Override
    public void play(){
        System.out.println("Strumming the Guitar Strings");
    }
}

class Piano implements Playable{
    
    @Override
    public void play(){
        System.out.println("Pressing the Piano Keys");
    }
}