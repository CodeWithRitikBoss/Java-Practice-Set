public class PracticeSet6 {
    public static void main(String[] args) {
        System.out.println("Practice set -6.");

        // Chapter 6.

        // // Question 1.
        // // Create an array of 5 floats and calculate their sum.
        // float[] arr = new float[5];
        // arr[0] = 1.1f;
        // arr[1] = 2.2f;
        // arr[2] = 3.3f;
        // arr[3] = 4.4f;
        // arr[4] = 5.5f;
        // float sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }
        // System.out.println("The sum of the array elements is: " + sum);

        // // Question 2.
        // // Write a program to find out whether a given integer is present in an array or not.
        // int[] arr = {1, 2, 3, 4, 5};
        // int target = 4; // The integer to search for
        // boolean found = false;
        // int index= -1;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == target) {
        //         index = i; // Store the index of the found element
        //         found = true;
        //         break; // Exit the loop if the target is found
        //     }
        // }
        // if (found) {
        //     System.out.println("The integer " + target + " is present in the array at index " + index + ".");
        // } else {
        //     System.out.println("The integer " + target + " is not present in the array.");
        // }

        // // Question 3.
        // // Calculate the average of marks from an array containing marks of all students in physics using for-each loop.
        // int[] marks = {85, 90, 78, 92, 88}; // Array containing marks of students in physics.
        // int sum = 0;
        // for (int mark : marks) {
        //     sum += mark; // Add each mark to the sum
        // }
        // float average = (float) sum / marks.length; // Calculate the average
        // System.out.println("The average marks in physics are: " + average);

        // // Question 4.
        // // Write a program to add two matrices of size 2*3.
        // int[][] matrix1 = {
        //     {1, 2, 3},
        //     {4, 5, 6}
        // };
        // int[][] matrix2 = {
        //     {7, 8, 9},
        //     {10, 11, 12}
        // };
        // int[][] sumMatrix = new int[2][3]; // Initialize the result matrix
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j]; // Add corresponding elements
        //     }
        // }
        // System.out.println("The sum of the two matrices is:");
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(sumMatrix[i][j] + " "); // Print the result matrix
        //     }
        //     System.out.println(); // Move to the next line after each row
        // }

        // // Question 5.
        // // Write a program to reverse an array.
        // int[] arr = {1, 2, 3, 4, 5}; // Original array
        // System.out.println("The Original array is:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " "); // Print the reversed array
        // }
        // System.out.println(); // Move to the next line after printing the array
        // int n = arr.length; // Length of the array
        // int[] reversedArr = new int[n]; // Array to store the reversed elements
        // for (int i = 0; i < n; i++) {
        //     reversedArr[i] = arr[n - 1 - i]; // Reverse the elements
        // }
        // System.out.println("The reversed array is:");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(reversedArr[i] + " "); // Print the reversed array
        // }
        // System.out.println(); // Move to the next line after printing the array

        // // Question 6.
        // // Write a program to find the maximum element in an array.
        // int[] arr = {5, 2, 8, 1, 9}; // Original array
        // int max = arr[0]; // Initialize max with the first element
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i]; // Update max if a larger element is found
        //     }
        // }
        // System.out.println("The maximum element in the array is: " + max); // Print the maximum element

        // Question 7.
        // Write a program to find the minimum element in an array.
        int[] arr = {5, 2, 8, 1, 9}; // Original array
        int min= arr[0]; // Initialize min with the first element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
        }
        System.out.println("The minimum element in the array is: " + min); // Print the minimum element

        // // Question 8.
        // // Write a program to find whether an array is sorted or not.
        // int[] arr1 = {1, 2, 3, 4, 5}; // Original array
        // boolean isSorted = true; // Initialize isSorted to true
        // for (int i = 0; i < arr1.length - 1; i++) {
        //     if (arr1[i] > arr1[i + 1]) {
        //         isSorted = false; // Set isSorted to false if an element is greater than the next one
        //         break; // Exit the loop if the array is not sorted
        //     }
        // }
        // if (isSorted) {
        //     System.out.println("The array is sorted."); // Print if the array is sorted
        // } else {
        //     System.out.println("The array is not sorted."); // Print if the array is not sorted
        // }


    }
}
