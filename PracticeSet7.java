// import java.util.Scanner;

public class PracticeSet7 {

    // Method for Question 1.
    void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Method for Question 2.
    void printPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method for Question 3.
    int printSumOfNaturalNumbers(int n) {
        if (n == 1) {
            // Base case: if n is 1, return 1
            // This is the stopping condition for the recursion.
            return 1;
        }
        // Recursive case: return n + sum of natural numbers up to n-1
        // This is where the function calls itself with a smaller value of n.
        return n+ printSumOfNaturalNumbers(n - 1);
    }

    // Method for Question 4.
    void printPattern2() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method for Question 5.
    int fibonacci(int n) {
        if (n <= 1) {
            // Base case: if n is 0 or 1, return n
            // This is the stopping condition for the recursion.
            return n;
        }
        // Recursive case: return sum of the two previous Fibonacci numbers
        // This is where the function calls itself with smaller values of n.
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method for Question 6.
    double findAverage(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num; // Sum all the numbers
        }
        return (double) sum / numbers.length; // Calculate and return the average
    }

    // Method for Question 7.
    void repeat4(int n) {
        if(n == 0) {
            return; // Base case: if n is 0, return
        }
        System.out.println(4); // Print n stars
        repeat4(n - 1); // Recursive call with n-1
    }

    // Method for Question 8.
    void repeat2(int n) {
        if(n == 0) {
            return; // Base case: if n is 0, return
        }
        System.out.println(2); // Print n stars
        repeat2(n - 1); // Recursive call with n-1
    }

    // Method for Question 9.
    double celsiusToFahrenheit(double celsius) {
        // return (celsius * 9/5) + 32; // Convert Celsius to Fahrenheit
        return (celsius * 33.8); // Convert Celsius to Fahrenheit
    }

    public static void main(String[] args) {
        System.out.println("Practice set -7.");

        // Chapter 7.

        // // Question 1.
        // // Write a method to print multiplication table of a number n.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to print its multiplication table: ");
        // int n = sc.nextInt();
        // PracticeSet7 obj = new PracticeSet7();
        // obj.printMultiplicationTable(n);

        // // Question 2.
        // // Write a using method to print the following pattern:
        //     // *
        //     // * *
        //     // * * *
        //     // * * * *
        //     // * * * * *
        // PracticeSet7 obj = new PracticeSet7();
        // obj.printPattern();

        // // Question 3.
        // // Write a recursive method to calculate sum of first n natural numbers.
        // PracticeSet7 obj = new PracticeSet7();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to calculate the sum of first n natural numbers: ");
        // int n = sc.nextInt();
        // System.out.println("The sum of first " + n + " natural number is: " + obj.printSumOfNaturalNumbers(n));

        // // Question 4.
        // // Write a method to print the following pattern:
        // // * * * * *
        // // * * * *
        // // * * *
        // // * *
        // // *
        // PracticeSet7 obj = new PracticeSet7();
        // obj.printPattern2();

        // // Question 5.
        // // Write a method to print nth term of Fibonacci series using recursion.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to find the nth term of Fibonacci series: ");
        // int n = sc.nextInt();
        // PracticeSet7 obj = new PracticeSet7();
        // int result = obj.fibonacci(n);
        // System.out.println("The " + n + "th term of Fibonacci series is: " + result);

        // // Question 6.
        // // Write a method to find average of a set of numbers passed as arguments.
        // // The method should take a variable number of arguments (varargs).
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of elements: ");
        // int size = sc.nextInt();
        // int[] numbers = new int[size];
        // System.out.println("Enter the numbers:");
        // for (int i = 0; i < size; i++) {
        //     numbers[i] = sc.nextInt(); // Read each number from the user
        // }
        // PracticeSet7 obj = new PracticeSet7();
        // double average = obj.findAverage(numbers); // Calculate the average using the method
        // System.out.println("The average of the numbers is: " + average); // Print the average
        // sc.close(); // Close the scanner to prevent resource leaks
        // // Note: The scanner is closed at the end to prevent resource leaks.

        // // Question 7.
        // // Repeat 4 using recursion.
        // PracticeSet7 obj = new PracticeSet7();
        // obj.repeat4(5); // Call the repeat4 method to print the 4

        // // Question 8.
        // // Repeat 2 using recursion.
        // PracticeSet7 obj = new PracticeSet7();
        // obj.repeat2(5); // Call the repeat2 method to print the 2

        // // Question 9.
        // // Write a method to convert celsius into fahrenheit.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter temperature in Celsius: ");
        // double celsius = sc.nextDouble(); // Read temperature in Celsius from the user
        // PracticeSet7 obj = new PracticeSet7();
        // double fahrenheit = obj.celsiusToFahrenheit(celsius); // Convert Celsius to Fahrenheit using the method
        // System.out.println("Temperature in Fahrenheit: " + fahrenheit); // Print the converted temperature
        // sc.close(); // Close the scanner to prevent resource leaks
        // Note: The scanner is closed at the end to prevent resource leaks.

        // // Question 10.
        // // Repeat 3 using iterative approach.
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println(3); // Print numbers from 1 to 5
        // }
        // // Note: The iterative approach is used to print the number 3 five times.
        // // This is a simple loop that iterates 5 times and prints the number 3 in each iteration.
        


        
        
    }
}
