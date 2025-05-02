// // Class for question 1.
// class Circle {
//     private double radius; // Property to store the radius

//     // Constructor to initialize the circle with a radius
//     public Circle(double radius) {
//         this.radius = radius; // Set the radius property
//     }

//     // Method to get the radius of the circle
//     public double getRadius() {
//         return radius; // Return the radius property
//     }

//     // Method to calculate the area of the circle
//     public double calculateArea() {
//         return Math.PI * radius * radius; // Area = πr^2
//     }

//     // Method to calculate the circumference of the circle
//     public double calculateCircumference() {
//         return 2 * Math.PI * radius; // Circumference = 2πr
//     }
// }

// class Cylinder extends Circle {
//     private double height; // Property to store the height

//     // Constructor to initialize the cylinder with radius and height
//     public Cylinder(double radius, double height) {
//         super(radius); // Call the constructor of the Circle class
//         this.height = height; // Set the height property
//     }

//     // Method to get the height of the cylinder
//     public double getHeight() {
//         return height; // Return the height property
//     }

//     // Method to calculate the surface area of the cylinder
//     public double calculateSurfaceArea() {
//         return 2 * Math.PI * getRadius() * (getRadius() + height); // Surface area = 2πr(r + h)
//     }

//     // Method to calculate the volume of the cylinder
//     public double calculateVolume() {
//         return Math.PI * getRadius() * getRadius() * height; // Volume = πr^2h
//     }
// }

// // Class for question 2.
// class Rectangle {
//     private double length; // Property to store the length
//     private double width; // Property to store the width

//     // Constructor to initialize the rectangle with length and width
//     public Rectangle(double length, double width) {
//         this.length = length; // Set the length property
//         this.width = width; // Set the width property
//     }

//     // Method to get the length of the rectangle
//     public double getLength() {
//         return length; // Return the length property
//     }

//     // Method to get the width of the rectangle
//     public double getWidth() {
//         return width; // Return the width property
//     }

//     // Method to calculate the area of the rectangle
//     public double calculateArea() {
//         return length * width; // Area = length * width
//     }
// }

// // Class for question 3.
// class Circle {
//     private double radius; // Property to store the radius

//     // Constructor to initialize the circle with a radius
//     public Circle(double radius) {
//         this.radius = radius; // Set the radius property
//     }

//     // Method to get the radius of the circle
//     public double getRadius() {
//         return radius; // Return the radius property
//     }
// }

// class Cylinder extends Circle {
//     private double height; // Property to store the height

//     // Constructor to initialize the cylinder with radius and height
//     public Cylinder(double radius, double height) {
//         super(radius); // Call the constructor of the Circle class
//         this.height = height; // Set the height property
//     }

//     // Method to get the height of the cylinder
//     public double getHeight() {
//         return height; // Return the height property
//     }

//     // Method to calculate the volume of the cylinder
//     public double calculateVolume() {
//         return Math.PI * getRadius() * getRadius() * height; // Volume = πr^2h
//     }

//     // Method to calculate the surface area of the cylinder
//     public double calculateSurfaceArea() {
//         return 2 * Math.PI * getRadius() * (getRadius() + height); // Surface area = 2πr(r + h)
//     }
// }

// Class for question 4.
class Rectangle {
    private double length; // Property to store the length
    private double width; // Property to store the width

    // Constructor to initialize the rectangle with length and width
    public Rectangle(double length, double width) {
        this.length = length; // Set the length property
        this.width = width; // Set the width property
    }

    // Method to get the length of the rectangle
    public double getLength() {
        return length; // Return the length property
    }

    // Method to get the width of the rectangle
    public double getWidth() {
        return width; // Return the width property
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width; // Area = length * width
    }

    // Method to calculate the volume of the rectangle (treated as a cube)
    public double calculateVolume() {
        return length * width * length; // Volume = length * width * height (height is treated as length for a cube)
    }
}



public class PracticeSet10 {
    public static void main(String[] args) {
        System.out.println("Practice set - 10.");

        // Chapter 10.

        // // Question 1.
        // // Create a class Circle and use inheritance to create another class cylinder from it.
        // Cylinder cylinder = new Cylinder(5, 10); // Create a cylinder with radius 5 and height 10
        // System.out.println("Circle radius: " + cylinder.getRadius()); // Get the radius of the circle
        // System.out.println("Cylinder height: " + cylinder.getHeight()); // Get the height of the cylinder
        // System.out.println("Circle area: " + cylinder.calculateArea()); // Calculate the area of the circle
        // System.out.println("Circle circumference: " + cylinder.calculateCircumference()); // Calculate the circumference of the circle
        // System.out.println("Cylinder surface area: " + cylinder.calculateSurfaceArea()); // Calculate the surface area of the cylinder
        // System.out.println("Cylinder volume: " + cylinder.calculateVolume()); // Calculate the volume of the cylinder

        // // Question 2.
        // // Create a class Rectangle and use inheritance to create another class Cube try to keep it as close to read world scenario as possible.
        // Rectangle rectangle = new Rectangle(4, 5); // Create a rectangle with length 4 and width 5
        // System.out.println("Rectangle length: " + rectangle.getLength()); // Get the length of the rectangle
        // System.out.println("Rectangle width: " + rectangle.getWidth()); // Get the width of the rectangle
        // System.out.println("Rectangle area: " + rectangle.calculateArea()); // Calculate the area of the rectangle

        // // Question 3.
        // // Create methods for area & valume in question 1.
        // Cylinder cylinder = new Cylinder(5, 10); // Create a cylinder with radius 5 and height 10
        // System.out.println("Circle radius: " + cylinder.getRadius()); // Get the radius of the circle
        // System.out.println("Cylinder height: " + cylinder.getHeight()); // Get the height of the cylinder
        // System.out.println("Cylinder surface area: " + cylinder.calculateSurfaceArea()); // Calculate the surface area of the cylinder
        // System.out.println("Cylinder volume: " + cylinder.calculateVolume()); // Calculate the volume of the cylinder

        // // Question 4.
        // // Create methods for area & volume in question 2. also create a getters and setters.
        // Rectangle rectangle = new Rectangle(4, 5); // Create a rectangle with length 4 and width 5
        // System.out.println("Rectangle length: " + rectangle.getLength()); // Get the length of the rectangle
        // System.out.println("Rectangle width: " + rectangle.getWidth()); // Get the width of the rectangle
        // System.out.println("Rectangle area: " + rectangle.calculateArea()); // Calculate the area of the rectangle
        // System.out.println("Rectangle volume: " + rectangle.calculateVolume()); // Calculate the volume of the rectangle



    }
}
