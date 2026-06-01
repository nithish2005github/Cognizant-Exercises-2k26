import java.util.*;
import java.io.*;

class Inheritance{
    
    public static void main(String[] args) {
        
        Animal ani = new Animal();
        ani.makeSound();
        
        Dog dog = new Dog();
        dog.makeSound();
        
    }
}

class Animal{
    
    public void makeSound(){
        System.out.println("Roar");
    }
}

class Dog extends Animal{
    
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}