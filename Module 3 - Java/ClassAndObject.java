import java.util.*;
import java.io.*;

class ClassAndObject{
    
    public static void main(String[] args) {
        
        Car car1 = new Car();
        car1.make = "Tesla ";
        car1.model = "Model 3 ";
        car1.year = 2026;
        
        Car car2 = new Car();
        car2.make = "Mahindra ";
        car2.model = "Scorpio-N ";
        car2.year = 2022;
        
        car1.displayDetails();
        car2.displayDetails();
        
    }
}

class Car{
    String make;
    String model;
    int year;
    
    void displayDetails(){
        System.out.println("Car Details: " + make + model + year);
    }
}