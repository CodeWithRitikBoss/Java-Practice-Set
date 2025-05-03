// // Class for Question 4.
// class CustomException extends Exception {
//     public CustomException(String message) {
//         super(message);
//     }
// }

// Class for Question 5.
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class PracticeSet14 {
    public static void main(String[] args) {
        System.out.println("Practice Set - 14");

        // Chapter 14.

        // Question 1.
        // Write a program to demonstrate syntax, logical, and runtime errors in Java.
        // Syntax error: Missing semicolon
        // System.out.println("Hello World") // This line will cause a syntax error
        // Logical error: Incorrect calculation
        // int a = 5, b = 10;
        // int sum = a + b; // Correct calculation
        // System.out.println("Sum: " + sum); // This line will print the correct sum
        // Runtime error: Division by zero
        // int x = 10, y = 0;
        // int result = x / y; // This line will cause a runtime error (ArithmeticException)
        // System.out.println("Result: " + result); // This line will not be executed
        // System.out.println("This line will not be executed due to runtime error.");
        // System.out.println("This line will be executed after fixing the errors.");

        // // Question 2.
        // // Write a program that prints "Ha Ha Ha" during ArithmeticException and "He He He" during IllegalArgumentException.
        // try {
        //     int a = 10;
        //     // int b = 0; // This will cause an ArithmeticException (division by zero)
        //     int b= -1; // Uncomment this line to cause an IllegalArgumentException
        //     if (b < 0) {
        //         throw new IllegalArgumentException("Negative value not allowed");
        //     }
        //     // int b = 5; // Uncomment this line to avoid exceptions
        //     int result = a / b;
        // } catch (ArithmeticException e) {
        //     System.out.println("Ha Ha Ha (ArithmeticException)"); // This line will be executed during ArithmeticException
        // } catch (IllegalArgumentException e) {
        //     System.out.println("He He He (IllegalArgumentException)"); // This line will be executed during IllegalArgumentException
        // }

        // // Question 3.
        // // Write a program that allows you to keep accessing an array until a valid index is given if maximum returns exceed 5 print "Array index out of bounds exception" and "Maximum attempts exceeded".
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // System.out.print("Enter the size of the array: ");
        // int size = scanner.nextInt();
        // int[] array = {1, 2, 3, 4, 5};
        // int maxAttempts = 5;
        // int attempts = 0;
        // boolean validIndex = false;
        // for (int i= 0; i < size; i++) {
        //     try {
        //         System.out.println("At index " + i + " is: "+ array[i]);
        //         attempts++;
        //     }
        //     catch (ArrayIndexOutOfBoundsException e) {
        //         attempts++;
        //         System.out.println("Array index out of bounds exception. Attempt " + attempts + " of " + maxAttempts);
        //         if (attempts >= maxAttempts) {
        //             System.out.println("Maximum attempts exceeded.");
        //             break;
        //         }
        //     }
        // }

        // // Question 4.
        // // Modify program in question 3 to throw a custom exception if max retires are reached.
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // System.out.print("Enter the size of the array: ");
        // int size = scanner.nextInt();
        // int[] array = {1, 2, 3, 4, 5};
        // int maxAttempts = 5;
        // int attempts = 0;
        // boolean validIndex = false;
        // for (int i = 0; i < size; i++) {
        //     try {
        //         if(attempts >= maxAttempts) {
        //             throw new CustomException("Maximum attempts exceeded.");
        //         }
        //         System.out.println("At index " + i + " is: " + array[i]);
        //         attempts++;
        //         validIndex = true;
        //     } catch (CustomException e) {
        //         System.out.println(e.getMessage());
        //     }
        // }

        // // Question 5.
        // // Wrap the program in question 3 inside a method which throws your custom exception.
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // System.out.print("Enter the size of the array: ");
        // int size = scanner.nextInt();
        // int[] array = {1, 2, 3, 4, 5};
        // int maxAttempts = 5;
        // int attempts = 0;
        // boolean validIndex = false;
        // for (int i = 0; i < size; i++) {
        //     try {
        //         if(attempts >= maxAttempts) {
        //             throw new CustomException("Maximum attempts exceeded.");
        //         }
        //         System.out.println("At index " + i + " is: " + array[i]);
        //         attempts++;
        //         validIndex = true;
        //     } catch (CustomException e) {
        //         System.out.println(e.getMessage());
        //         break; // Exit the loop if maximum attempts exceeded
        //     }
        // }

    }
}
