// // Class for question 1.
// class Cylinder{
//     private double radius;
//     private double height;

//     public double getRadius() {
//         return radius;
//     }

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public void setHeight(double height) {
//         this.height = height;
//     }

//     public double calculateSurfaceArea() {
//         return 2 * Math.PI * radius * (radius + height); // Surface area = 2πr(r + h)
//     }

//     public double calculateVolume() {
//         return Math.PI * radius * radius * height; // Volume = πr^2h
//     }
// }

// // Class for question 2.
// class Cylinder {
//     private double radius; // Property to store the radius
//     private double height; // Property to store the height

//     // Constructor to initialize the cylinder with radius and height
//     public void setter(double radius, double height) {
//         this.radius = radius; // Set the radius property
//         this.height = height; // Set the height property
//     }

//     // Method to calculate the surface area of the cylinder
//     public double calculateSurfaceArea() {
//         return 2 * Math.PI * radius * (radius + height); // Surface area = 2πr(r + h)
//     }

//     // Method to calculate the volume of the cylinder
//     public double calculateVolume() {
//         return Math.PI * radius * radius * height; // Volume = πr^2h
//     }
// }

// // Class for question 3.
// class Cylinder {
//     private double radius; // Property to store the radius
//     private double height; // Property to store the height

//     // Constructor to initialize the cylinder with radius and height
//     public Cylinder(double radius, double height) {
//         this.radius = radius; // Set the radius property
//         this.height = height; // Set the height property
//     }

//     public double getRadius() {
//         return radius; // Return the radius property
//     }

//     public double getHeight() {
//         return height; // Return the height property
//     }

    
// }

// // Class for question 4.
// class Rectangle {
//     private double length; // Property to store the length
//     private double width; // Property to store the width

//     public Rectangle() {
//         this.length = 4; // Default length
//         this.width = 5; // Default width
//     }

//     // Constructor to initialize the rectangle with length and width
//     public Rectangle(double length, double width) {
//         this.length = length; // Set the length property
//         this.width = width; // Set the width property
//     }

//     public double getLength() {
//         return length; // Return the length property
//     }

//     public double getWidth() {
//         return width; // Return the width property
//     }
// }

// // Class for question 5.
// class Sphere {
//     private double radius; // Property to store the radius

//     // Constructor to initialize the sphere with radius
//     public void setRadius(double radius) {
//         this.radius = radius; // Set the radius property
//     }

//     public double getRadius() {
//         return radius; // Return the radius property
//     }
// }

public class PracticeSet9 {
    public static void main(String[] args) {
        System.out.println("Practice Set - 9");

        // Chapter 9.

        // // Question 1.
        // // Create a class cylinder and use getters and setters to set it's radius and height.
        // Cylinder cylinder = new Cylinder();
        // cylinder.setRadius(5.0); // Set the radius using the setter method
        // cylinder.setHeight(10.0); // Set the height using the setter method
        // System.out.println("Radius: " + cylinder.getRadius()); // Get the radius using the getter method
        // System.out.println("Height: " + cylinder.getHeight()); // Get the height using the getter method

        // // Question 2.
        // // User question 1 to calculate surface area and volume of the cylinder.
        // Cylinder cylinder = new Cylinder();
        // cylinder.setter(5.0, 10.0); // Set the radius and height using the setter method
        // double surfaceArea = cylinder.calculateSurfaceArea(); // Calculate the surface area
        // double volume = cylinder.calculateVolume(); // Calculate the volume
        // System.out.println("Surface Area: " + surfaceArea); // Print the surface area
        // System.out.println("Volume: " + volume); // Print the volume

        // // Question 3.
        // // User a constructor and repeat question 1 for it.
        // Cylinder cylinder = new Cylinder(5.0, 10.0); // Create a cylinder object using the constructor
        // System.out.println("Radius: " + cylinder.getRadius()); // Get the radius using the getter method
        // System.out.println("Height: " + cylinder.getHeight()); // Get the height using the getter method

        // // Question 4.
        // // Overload a constructor used to initialize a rectangle of length 4 and breath 5 for using custom parameters.
        // Rectangle rectangle = new Rectangle(); // Create a rectangle object using the constructor
        // System.out.println("Length: " + rectangle.getLength()); // Get the length using the getter method
        // System.out.println("Width: " + rectangle.getWidth()); // Get the width using the getter method
        // rectangle = new Rectangle(6.0, 8.0); // Create a rectangle object using the constructor with custom parameters
        // System.out.println("Length: " + rectangle.getLength()); // Get the length using the getter method
        // System.out.println("Width: " + rectangle.getWidth()); // Get the width using the getter method


        // // Question 5.
        // // Repeat question 1 for a sphere.
        // Sphere sphere = new Sphere(); // Create a sphere object
        // sphere.setRadius(5.0); // Set the radius using the setter method
        // System.out.println("Radius: " + sphere.getRadius()); // Get the radius using the getter method

    }
}
