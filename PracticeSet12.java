// // Package: CalculatorPackage for question 1.
// package CalculatorPackage;

// // Class for Question 1.
// class Calculator {
//     public void add(int a, int b) {
//         System.out.println("Sum: " + (a + b));
//     }

//     public void subtract(int a, int b) {
//         System.out.println("Difference: " + (a - b));
//     }
// }
// class ScientificCalculator extends Calculator {
//     public void sin(double angle) {
//         System.out.println("Sine: " + Math.sin(Math.toRadians(angle)));
//     }

//     public void cos(double angle) {
//         System.out.println("Cosine: " + Math.cos(Math.toRadians(angle)));
//     }
// }
// class HybridCalculator extends ScientificCalculator {
//     public void multiply(int a, int b) {
//         System.out.println("Product: " + (a * b));
//     }

//     public void divide(int a, int b) {
//         if (b != 0) {
//             System.out.println("Quotient: " + (a / b));
//         } else {
//             System.out.println("Cannot divide by zero.");
//         }
//     }
// }

// // Import Scanner class for user input for question 2.
// import java.util.Scanner;

// // Class for Question 3.
// package folder1.folder2.folder3; // Package structure: folder1 > folder2 > folder3
// // This class is in the package "folder1.folder2.folder3"
// class PackageExample {
//     public void displayMessage() {
//         System.out.println("This is a message from the package folder1.folder2.folder3.");
//     }
// }
// // This is a Java program that demonstrates the use of packages, classes, and methods.

// // Class for Question 4.
// class BaseClass {
//     // Default property (accessible only within the same package)
//     int defaultProperty = 10;

//     // Protected property (accessible within the same package and subclasses)
//     protected int protectedProperty = 20;
// }
// class SubClass extends BaseClass {
//     public void setProperties(int defaultProperty, int protectedProperty) {
//         // Attempting to set the default property (not accessible outside the package)
//         // this.defaultProperty = defaultProperty; // This line would cause a compilation error

//         // Setting the protected property (accessible in subclass)
//         this.protectedProperty = protectedProperty;
//     }
//     public void displayProperties() {
//         // Accessing default property (accessible within the same package)
//         System.out.println("Default Property: " + defaultProperty);
//         // Accessing protected property (accessible in subclass)
//         System.out.println("Protected Property: " + protectedProperty);
//     }
// }


public class PracticeSet12 {
    public static void main(String[] args) {
        System.out.println("Practice Set - 12");

        // Chapter 12.

        // // Question 1.
        // // Create three classes Calculator, ScientificCalculator, and HybridCalculator and group them into a package called "CalculatorPackage".
        // HybridCalculator hybridCalc = new HybridCalculator();
        // hybridCalc.add(5, 3); // Inherited from Calculator
        // hybridCalc.subtract(5, 3); // Inherited from Calculator
        // hybridCalc.multiply(5, 3); // Inherited from HybridCalculator
        // hybridCalc.divide(5, 3); // Inherited from HybridCalculator
        // hybridCalc.sin(30); // Inherited from ScientificCalculator
        // hybridCalc.cos(60); // Inherited from ScientificCalculator

        // // Complie this file using the command: javac -d . PracticeSet12.java
        // // Run the program using the command: java CalculatorPackage.PracticeSet12
        // // Run the program using the command: java CalculatorPackage/PracticeSet12

        // // Question 2.
        // // User a build-in package in java to write a class which displays a message (by using sout) after taking input from the user.
        // Scanner scanner = new Scanner(System.in); // Import the Scanner class for user and Create a Scanner object to read input from the user
        // System.out.print("Enter your name: "); // Prompt the user to enter their name
        // String name = scanner.nextLine(); // Read the user's input (name)
        // System.out.println("Hello, " + name + "! Welcome to the program."); // Display a message using the user's input
        // scanner.close(); // Close the Scanner object to free up resources

        // // Question 3.
        // // Create a package in class with three packages levels: folder1, folder2 and folder3.
        // PackageExample packageExample = new PackageExample(); // Create an instance of PackageExample class
        // packageExample.displayMessage(); // Call the displayMessage method to print the message

        // // Compile this file using the command: javac -d . PracticeSet12.java
        // // Run the program using the command: java folder1.folder2.folder3.PracticeSet12
        // // Run the program using the command: java folder1/folder2/folder3/PracticeSet12

        // // Question 4.
        // // Prove that you connot access default property but can access protected property from the subclass of the same package.
        // SubClass subClass = new SubClass(); // Create an instance of SubClass
        // subClass.displayProperties(); // Call the method to display properties
        // // defaultProperty is not accessible here, so we cannot set it directly because it is default access modifier. default access modifier is only accessible within the same package and not in the subclass.
        // subClass.setProperties(30, 40); // Set the protected property using the method in subclass
        // subClass.displayProperties(); // Call the method to display properties again to see the updated values
        
    }
}
