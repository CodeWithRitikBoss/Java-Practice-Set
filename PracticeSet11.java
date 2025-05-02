// // Class for question 1.
// abstract class Pen {
//     // Abstract method to write
//     public abstract void write(String text);

//     // Abstract method to refill
//     public abstract void refill(int inkAmount);
// }
// class BallPen extends Pen {
//     // Implementation of the write method for BallPen
//     @Override
//     public void write(String text) {
//         System.out.println("Writing with BallPen: " + text);
//     }

//     // Implementation of the refill method for BallPen
//     @Override
//     public void refill(int inkAmount) {
//         System.out.println("Refilling BallPen with " + inkAmount + " units of ink.");
//     }
// }

// // Class for question 2.
// abstract class Pen {
//     // Abstract method to write
//     public abstract void write(String text);

//     // Abstract method to refill
//     public abstract void refill(int inkAmount);
// }
// class FountainPen extends Pen {
//     // Implementation of the write method for FountainPen
//     @Override
//     public void write(String text) {
//         System.out.println("Writing with FountainPen: " + text);
//     }

//     // Implementation of the refill method for FountainPen
//     @Override
//     public void refill(int inkAmount) {
//         System.out.println("Refilling FountainPen with " + inkAmount + " units of ink.");
//     }

//     // Additional method to change the nib of the fountain pen
//     public void changeNib(String newNib) {
//         System.out.println("Changing nib to: " + newNib);
//     }
// }

// // Interface & Class for question 3.
// interface BasicAnimal {
//     // Method to eat
//     void eat();

//     // Method to sleep
//     void sleep();
// }
// class Monkey {
//     // Method to make the monkey jump
//     public void jump() {
//         System.out.println("Monkey is jumping.");
//     }

//     // Method to make the monkey bite
//     public void bite() {
//         System.out.println("Monkey is biting.");
//     }
// }
// class Human extends Monkey implements BasicAnimal {
//     // Properties to store the name of human.
//     private String name;

//     // Constructor to initialize the name of human.
//     public Human() {
//         this.name = "Human"; // Set the name property
//     }
//     public Human(String name) {
//         this.name = name; // Set the name property
//     }
//     // Method to get the name of human.
//     public String getName() {
//         return name; // Return the name property
//     }
//     // Implementation of the eat method from BasicAnimal interface
//     @Override
//     public void eat() {
//         System.out.println(name+ " is eating.");
//     }

//     // Implementation of the sleep method from BasicAnimal interface
//     @Override
//     public void sleep() {
//         System.out.println(name+ " is sleeping.");
//     }

//     // Method to Speak human.
//     public void speak() {
//         System.out.println(name+ " is speaking.");
//     }
// }

// // Class for question 4.
// abstract class Telephone {
//     // Abstract method to ring the telephone
//     public abstract void ring();

//     // Abstract method to lift the telephone
//     public abstract void lift();

//     // Abstract method to disconnect the telephone
//     public abstract void disconnect();
// }
// class SmartPhone extends Telephone {
//     // Implementation of the ring method for SmartPhone
//     @Override
//     public void ring() {
//         System.out.println("SmartPhone is ringing.");
//     }

//     // Implementation of the lift method for SmartPhone
//     @Override
//     public void lift() {
//         System.out.println("SmartPhone is lifted.");
//     }

//     // Implementation of the disconnect method for SmartPhone
//     @Override
//     public void disconnect() {
//         System.out.println("SmartPhone is disconnected.");
//     }
// }

// // Class for question 5.
// class Monkey {
//     // Method to make the monkey jump
//     public void jump() {
//         System.out.println("Monkey is jumping from branch to branch...");
//     }

//     // Method to make the monkey climb
//     public void climb() {
//         System.out.println("Monkey is climbing a tree...");
//     }

//     // Method to make the monkey speak
//     public void speak() {
//         System.out.println("Monkey is speaking.");
//     }
// }
// class Human extends Monkey {
//     // Method to make the human jump
//     @Override
//     public void jump() {
//         System.out.println("Human is jumping while palying sports...");
//     }

//     // Method to make the human climb
//     @Override
//     public void climb() {
//         System.out.println("Human is climbing a mountain...");
//     }

//     // Method to make the human speak
//     @Override
//     public void speak() {
//         System.out.println("Human is speaking in a human language.");
//     }
// }

// // Interface for question 6.
// interface TVRemote {
//     // Method to turn on the TV
//     void turnOn();

//     // Method to turn off the TV
//     void turnOff();

//     // Method to change the channel
//     void changeChannel(int channel);
// }
// interface SmartTVRemote extends TVRemote {
//     // Method to connect to the internet
//     void connectToInternet();

//     // Method to stream content
//     void streamContent(String content);
// }

// // Interface and Class for question 7.
// interface TVRemote {
//     // Method to turn on the TV
//     void turnOn();

//     // Method to turn off the TV
//     void turnOff();

//     // Method to change the channel
//     void changeChannel(int channel);
// }
// class TV implements TVRemote {
//     // Implementation of the turnOn method for TV
//     @Override
//     public void turnOn() {
//         System.out.println("TV is turned on.");
//     }

//     // Implementation of the turnOff method for TV
//     @Override
//     public void turnOff() {
//         System.out.println("TV is turned off.");
//     }

//     // Implementation of the changeChannel method for TV
//     @Override
//     public void changeChannel(int channel) {
//         System.out.println("Changing channel to: " + channel);
//     }
// }



public class PracticeSet11 {
    public static void main(String[] args) {
        System.out.println("Practice Set - 11");

        // Chapter 11.

        // // Question 1.
        // // Create an abstract class Pen with methods write() and refill() as abstract methods.
        // BallPen ballPen = new BallPen(); // Create an instance of BallPen
        // ballPen.write("Hello, World!"); // Call the write method
        // ballPen.refill(10); // Call the refill method

        // // Question 2.
        // // User the Pen class from question 1 to create a concrete class fountainPen. with additional method changeNib().
        // FountainPen fountainPen = new FountainPen(); // Create an instance of FountainPen
        // fountainPen.write("Hello, FountainPen!"); // Call the write method
        // fountainPen.refill(5); // Call the refill method
        // fountainPen.changeNib("Fine Nib"); // Call the changeNib method

        // // Question 3.
        // // Create a class Monkey with jump() and bite() methods, create a class Human which inherits this monkey class and implement BasicAnimal interface with eat() and sleep() methods.
        // Human human = new Human(); // Create an instance of Human
        // human.eat(); // Call the eat method
        // human.sleep(); // Call the sleep method
        // human.jump(); // Call the jump method from Monkey class
        // human.bite(); // Call the bite method from Monkey class
        // Monkey monkey = new Human(); // Create an instance of Human as a Monkey
        // monkey.jump(); // Call the jump method from Monkey class
        // monkey.bite(); // Call the bite method from Monkey class
        // // monkey.speak(); // Call the speak method from Human class --> This will cause a compile-time error because the speak() method is not defined in the Monkey class.
        // human.speak(); // Call the speak method from Human class
        // Human john = new Human("John"); // Create an instance of Human with name "John"
        // System.out.println("Human name: " + john.getName()); // Get the name of the human
        // john.eat(); // Call the eat method
        // john.sleep(); // Call the sleep method
        // john.speak(); // Call the speak method
        // john.jump(); // Call the jump method from Monkey class

        // // Question 4.
        // // Create a class Telephone with ring() and lift() and disconnect() methods as abstract methods and create another class SmartPhone and demonstrate the polimorphism.
        // Telephone myPhone = new SmartPhone(); // Create an instance of SmartPhone
        // myPhone.ring(); // Call the ring method
        // myPhone.lift(); // Call the lift method
        // myPhone.disconnect(); // Call the disconnect method

        // // Question 5.
        // // Demonstrate ploymorphism using monkey class from question 3.
        // Monkey monkey = new Monkey(); // Create an instance of Monkey
        // monkey.jump(); // Call the jump method from Monkey class
        // monkey.climb(); // Call the climb method from Monkey class
        // monkey.speak(); // Call the speak method from Monkey class
        // Human human = new Human(); // Create an instance of Human
        // human.jump(); // Call the jump method from Human class
        // human.climb(); // Call the climb method from Human class
        // human.speak(); // Call the speak method from Human class
        // Monkey monkeyHuman = new Human(); // Create an instance of Human as a Monkey
        // monkeyHuman.jump(); // Call the jump method from Human class
        // monkeyHuman.climb(); // Call the climb method from Human class
        // monkeyHuman.speak(); // Call the speak method from Human class
        // // monkeyHuman.bite(); // Call the bite method from Monkey class --> This will cause a compile-time error because the bite() method is not defined in the Monkey class.

        // // Question 6.
        // // Create an interface TVRemote and use it to inherite another interface SmartTVRemote.
        // SmartTVRemote smartTVRemote = new SmartTVRemote() {
        //     // Implement the methods of SmartTVRemote interface
        //     @Override
        //     public void turnOn() {
        //         System.out.println("Smart TV is turned on.");
        //     }

        //     @Override
        //     public void turnOff() {
        //         System.out.println("Smart TV is turned off.");
        //     }

        //     @Override
        //     public void changeChannel(int channel) {
        //         System.out.println("Changing channel to: " + channel);
        //     }

        //     @Override
        //     public void connectToInternet() {
        //         System.out.println("Connecting to the internet.");
        //     }

        //     @Override
        //     public void streamContent(String content) {
        //         System.out.println("Streaming content: " + content);
        //     }
        // };
        // // Use the SmartTVRemote instance
        // smartTVRemote.turnOn(); // Call the turnOn method
        // smartTVRemote.changeChannel(5); // Call the changeChannel method
        // smartTVRemote.connectToInternet(); // Call the connectToInternet method
        // smartTVRemote.streamContent("Movie"); // Call the streamContent method
        // smartTVRemote.turnOff(); // Call the turnOff method

        // // Question 7.
        // // Create a class TV which implements TVRemote interface from question 6.
        // TV tv = new TV(); // Create an instance of TV
        // tv.turnOn(); // Call the turnOn method
        // tv.changeChannel(10); // Call the changeChannel method
        // tv.turnOff(); // Call the turnOff method
        // TVRemote tvRemote = new TV(); // Create an instance of TV as a TVRemote
        // tvRemote.turnOn(); // Call the turnOn method
        // tvRemote.changeChannel(20); // Call the changeChannel method
        // tvRemote.turnOff(); // Call the turnOff method

    }
}
