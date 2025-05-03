// Class for Question 1
class Employee {
    private int salary; // Property to store salary
    private String name; // Property to store name

    // Method to set the salary
    public void setSalary(int salary) {
        this.salary = salary; // Set the salary property
    }

    // Method to get the salary
    public int getSalary() {
        return this.salary; // Return the salary property
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name; // Set the name property
    }

    // Method to get the name
    public String getName() {
        return this.name; // Return the name property
    }
}

// Class for Question 2
class CellPhone {
    // Method to print "Ringing..."
    public void ring() {
        System.out.println("Ringing...");
    }

    // Method to print "Vibrating..."
    public void vibrate() {
        System.out.println("Vibrating...");
    }
}

// Class for Question 3
class Square {
    private double side; // Property to store the side length

    // Method to set the side length
    public void setSide(double side) {
        this.side = side; // Set the side property
    }

    // Method to calculate the area of the square
    public double calculateArea() {
        return side * side; // Return the area (side^2)
    }

    // Method to calculate the perimeter of the square
    public double calculatePerimeter() {
        return 4 * side; // Return the perimeter (4 * side)
    }
}

// Class for Question 4
class Rectangle {
    private double length; // Property to store the length
    private double width; // Property to store the width

    // Method to set the length and width
    public void setDimensions(double length, double width) {
        this.length = length; // Set the length property
        this.width = width; // Set the width property
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width; // Return the area (length * width)
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width); // Return the perimeter (2 * (length + width))
    }
}

// Class for Question 5
class TommyVecetti {
    // Method to print "Hitting..."
    public void hit() {
        System.out.println("Hitting...");
    }

    // Method to print "Running..."
    public void run() {
        System.out.println("Running...");
    }

    // Method to print "Firing..."
    public void fire() {
        System.out.println("Firing...");
    }
}

// Class for Question 6
class Circle {
    private double radius; // Property to store the radius

    // Method to set the radius
    public void setRadius(double radius) {
        this.radius = radius; // Set the radius property
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius; // Return the area (π * radius^2)
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius; // Return the circumference (2 * π * radius)
    }
}

public class PracticeSet8 {
    public static void main(String[] args) {
        System.out.println("Practice set -8.");

        // Chapter 8.

        // // Question 1.
        // // Create a class Employee with following properties and methods:
        // // salary(property)(int)
        // // setSalary(method accepting int and setting the salary)
        // // getSalary(method reurning int)
        // // name(property)(String)
        // // setName(method accepting String and setting the name)
        // // getName(method returning String)
        // Employee emp = new Employee(); // Create an instance of Employee class
        // emp.setSalary(50000); // Set the salary using setSalary method
        // emp.setName("John Doe"); // Set the name using setName method
        // System.out.println("Employee Name: " + emp.getName()); // Get the name using getName method
        // System.out.println("Employee Salary: " + emp.getSalary()); // Get the salary using getSalary method

        // // Question 2.
        // // Create a class CellPhone with methods to print "Ringing..." and "Vibrating..." etc.
        // CellPhone phone = new CellPhone(); // Create an instance of CellPhone class
        // phone.ring(); // Call the ring method
        // phone.vibrate(); // Call the vibrate method

        // // Question 3.
        // // Create a class Square with a method to initialize it's side, calculating area, parimeter etc.
        // Square square = new Square(); // Create an instance of Square class
        // square.setSide(5.0); // Set the side length using setSide method
        // System.out.println("Area of the square: " + square.calculateArea()); // Calculate and print the area
        // System.out.println("Perimeter of the square: " + square.calculatePerimeter()); // Calculate and print the perimeter

        // // Question 4.
        // // Create a class Rectangle and repeat question 3 for it.
        // Rectangle rectangle = new Rectangle(); // Create an instance of Rectangle class
        // rectangle.setDimensions(4.0, 6.0); // Set the length and width using setDimensions method
        // System.out.println("Area of the rectangle: " + rectangle.calculateArea()); // Calculate and print the area
        // System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter()); // Calculate and print the perimeter

        // // Question 5.
        // // Create a class TommyVecetti for Rockstar games capable of hitting(print hitting), running(print running), and firing(print firing) etc.
        // TommyVecetti tommy = new TommyVecetti(); // Create an instance of TommyVecetti class
        // tommy.hit(); // Call the hit method to print "Hitting..."
        // tommy.run(); // Call the run method to print "Running..."
        // tommy.fire(); // Call the fire method to print "Firing..."
        // System.out.println(); // Print a new line for better readability

        // // Question 6.
        // // Repeat queston 4 for a circle.
        // Circle circle = new Circle(); // Create an instance of Circle class
        // circle.setRadius(3.0); // Set the radius using setRadius method
        // System.out.println("Area of the circle: " + circle.calculateArea()); // Calculate and print the area
        // System.out.println("Circumference of the circle: " + circle.calculateCircumference()); // Calculate and print the circumference
        // System.out.println(); // Print a new line for better readability

    }
}
