/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marktimestwo
 */
public class CarHomework {
    String make;
    String model;
    int numWheels;
    String colour;
    
    public void drive(double direction) {
        System.out.printf("The %s %s is driving at %s at %d degrees", colour, make, direction);
        System.out.printf("The %s %s is not driving at %s at %d degrees", colour, make, direction);
        System.out.printf("The %s %s is running at %s at %d degrees", colour, make, direction);
    }
    
    public void drive(String direction) {
        System.out.println("The " + colour + "" + make + " is driving " + direction);
        System.out.println("The " + colour + "" + make + " is not driving " + direction);
        System.out.println("The " + make + "" + colour + " is not driving " + direction);

    }
}
