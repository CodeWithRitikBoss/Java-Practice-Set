// import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
        System.out.println("Practice set -4.");

        // Chapter 4.

        // // Question 1.
        // // What will be the output of this program.
        //     // int a= 10;
        //     // if(a== 11)
        //     //      System.out.println("I am 11");
        //     // else
        //     //      System.out.println("I am not 11");
        
        // int a = 10;
        // if(a== 11){
        //     System.out.println("I am 11.");
        // }else{
        //     System.out.println("I am not 11.");
        // }

        // // Question 2.
        // // Write a program to find out whether a student is pass or fail, if it requires total 40% and at least 33% in each subject to pass. assume 3 subjects and take marks as an input from the user.
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        // System.out.print("Enter marks for Subject 1: ");
        // int subject1 = sc.nextInt();
        // System.out.print("Enter marks for Subject 2: ");
        // int subject2 = sc.nextInt();
        // System.out.print("Enter marks for Subject 3: ");
        // int subject3 = sc.nextInt();
        // float total = subject1 + subject2 + subject3;
        // float percentage = (total / 300) * 100;
        // if (subject1 >= 33 && subject2 >= 33 && subject3 >= 33 && percentage >= 40) {
        //     System.out.println("Congratulations! You passed.");
        // } else {
        //     System.out.println("Sorry, you failed.");
        // }

        // // // Question 3.
        // // calculate income tax paid by an employee government as per the slabs mentioned below:
        // // Income slab:       Tax rate:
        // // 0 - 2.5 Lakh:     0%
        // // 2.5 - 5 Lakh:     5%
        // // 5 - 10 Lakh:      20%
        // // 10 Lakh and above: 30%
        // // Note that there is not text below 2.5 Lakh. Take input amout as and input from the user.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your income: ");
        // float income = sc.nextFloat();
        // float tax = 0;
        // if (income <= 250000) {
        //     tax = 0;
        // } else if (income <= 500000) {
        //     tax = (income - 250000) * 0.05f;
        // } else if (income <= 1000000) {
        //     tax = (income - 500000) * 0.20f + 12500; // 12500 is the tax for the first slab
        // } else {
        //     tax = (income - 1000000) * 0.30f + 112500; // 112500 is the tax for the first two slabs
        // }
        // System.out.println("Your income tax is: " + tax);

        // // Question 4.
        // // Write a program to find out the day of the week given the number [1 for Monday, 2 for Tuesday, ... , 7 for Sunday].
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number (1-7) for the day of the week: ");
        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid input. Please enter a number between 1 and 7.");
        // }

        // // Question 5.
        // // Write a program to find whether a year entered by the user is a leap year or not.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a year: ");
        // int year = sc.nextInt();
        // boolean isLeapYear = false;
        // if (year % 4 == 0) {
        //     if (year % 100 == 0) {
        //         if (year % 400 == 0) {
        //             isLeapYear = true;
        //         } else {
        //             isLeapYear = false;
        //         }
        //     } else {
        //         isLeapYear = true;
        //     }
        // } else {
        //     isLeapYear = false;
        // }
        // if (isLeapYear) {
        //     System.out.println(year + " is a leap year.");
        // } else {
        //     System.out.println(year + " is not a leap year.");
        // }

        // // Question 6.
        // // Write a program to find out the type of website from the url.
        //     // .come -> Commercial website.
        //     // .org -> Origanization website.
        //     // .in -> Indian website.
        //     // .edu -> Educational website.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a URL: ");
        // String url = sc.nextLine();
        // if (url.endsWith(".com")) {
        //     System.out.println("Commercial website.");
        // } else if (url.endsWith(".org")) {
        //     System.out.println("Organization website.");
        // } else if (url.endsWith(".in")) {
        //     System.out.println("Indian website.");
        // } else if (url.endsWith(".edu")) {
        //     System.out.println("Educational website.");
        // } else {
        //     System.out.println("Unknown website type.");
        // }

        
    }
}
