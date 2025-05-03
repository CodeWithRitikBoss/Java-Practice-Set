// // Class for Question 1.
// class MyThreadClass1 extends Thread {
//     public void run() {
//         while (true) {
//             System.out.println("Good Morning");
//             try {
//                 Thread.sleep(1000); // Sleep for 1 second
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class MyThreadClass2 extends Thread {
//     public void run() {
//         while (true) {
//             System.out.println("Welcome");
//             try {
//                 Thread.sleep(1000); // Sleep for 1 second
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// // Class for Question 2.
// // This class extends the Thread class to create a thread that prints a message in slow motion.
// class SlowMotionThread extends Thread {
//     public void run() {
//         String message = "Java programming is fun and challenging to learn.";
//         for (char c : message.toCharArray()) {
//             System.out.print(c); // Print each character
//             try {
//                 Thread.sleep(200); // Sleep for 0.2 seconds between characters
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//         System.out.println(); // Move to the next line after printing the message
//     }
// }

// // class for Question 3.
// class MySleepThread extends Thread {
//     public void run() {
//         int i = 0;
//         while (true) {
//             System.out.println("Welcome"+" - " + i);
//             try {
//                 Thread.sleep(200); // Sleep for 200 milliseconds
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             i++;
//         }
//     }
// }

// // Class for Question 4.
// // This class demonstrates the use of getPriority() and setPriority() methods in Java Threads.
// class PriorityThread extends Thread {
//     public void run() {
//         while (true) {
//             System.out.println("Thread Name: " + getName() + ", Priority: " + getPriority());
//             // Print the thread name and priority
//             // The priority is set using setPriority() method in the main method
//             // The thread will run continuously, printing its name and priority
//             try {
//                 Thread.sleep(200); // Sleep for 200 milliseconds
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// // Class for Question 5.
// // This class demonstrates how to get the state of a thread in Java.
// class ThreadStateExample extends Thread {
//     public void run() {
//         // Simulate some work in the thread
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Thread is running: " + i);
//             try {
//                 Thread.sleep(500); // Sleep for 0.5 seconds
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// // This is a Java program that demonstrates the use of threads and their states.

// // Class for Question 6.
// // This class demonstrates how to get the reference of the current thread in Java.
// class CurrentThreadExample extends Thread {
//     public void run() {
//         // Get the reference of the current thread
//         Thread currentThread = Thread.currentThread();
//         System.out.println("Current Thread Name: " + currentThread.getName());
//         System.out.println("Current Thread \""+ currentThread.getName()+ "\" ID: " + currentThread.getId());
//         // Print the name and ID of the current thread
//     }
// }
// // This is a Java program that demonstrates how to get the reference of the current thread.


public class PracticeSet13 {
    public static void main(String[] args) {
        System.out.println("Practice Set 13.");

        // Chapter 13.

        // // Question 1.
        // // Write a program to print "Good Morning" and "Welcome" continuously on the screen in java using Threads.
        // MyThreadClass1 thread1 = new MyThreadClass1();
        // MyThreadClass2 thread2 = new MyThreadClass2();
        // thread1.start(); // Start the first thread
        // thread2.start(); // Start the second thread
        // // The threads will run concurrently, printing "Good Morning" and "Welcome" every 1 seconds.

        // // Question 2.
        // // Print this: "Java programming is fun and challenging to learn." in slow motion using Thread class.
        // SlowMotionThread slowMotionThread = new SlowMotionThread();
        // slowMotionThread.start(); // Start the slow motion thread

        // // Question 3.
        // // Add a sleep method in welcome thread of question 1 to delay it's execution for 200 milliseconds.
        // MySleepThread sleepThread = new MySleepThread();
        // sleepThread.start(); // Start the sleep thread

        // // Question 4.
        // // Demonstrate getPriority() and setPriority() methods in java Threads.
        // PriorityThread thread1 = new PriorityThread();
        // PriorityThread thread2 = new PriorityThread();
        // thread1.setName("Thread 1");
        // thread2.setName("Thread 2");
        // thread1.setPriority(Thread.MIN_PRIORITY); // Set minimum priority
        // thread2.setPriority(Thread.MAX_PRIORITY); // Set maximum priority
        // thread1.start(); // Start the first thread
        // thread2.start(); // Start the second thread

        // // Question 5.
        // // How do you get state of a thread in java?
        // ThreadStateExample threadStateExample = new ThreadStateExample();
        // System.out.println("Thread State: " + threadStateExample.getState()); // Print initial state
        // threadStateExample.start(); // Start the thread
        // try {
        //     threadStateExample.join(); // Wait for the thread to finish
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // System.out.println("Thread State after completion: " + threadStateExample.getState()); // Print final state
        // // The thread will be in the TERMINATED state after completion.

        // // Question 6.
        // // How do you get reference of current thread in java?
        // CurrentThreadExample currentThreadExample1 = new CurrentThreadExample();
        // currentThreadExample1.start(); // Start the thread
        // CurrentThreadExample currentThreadExample2 = new CurrentThreadExample();
        // currentThreadExample2.start(); // Start the thread
        // // The thread will print the name and ID of the current thread.



    }
}
