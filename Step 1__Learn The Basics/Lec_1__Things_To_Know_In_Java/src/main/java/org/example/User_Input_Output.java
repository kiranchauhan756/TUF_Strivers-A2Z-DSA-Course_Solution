package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
Complete the function printNumber which takes an integer input from the user and prints it on the screen.



Use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()

Examples:
Input(user gives value): 7

Output: 7

Input(user gives value): -5

Output: -5


 */
public class User_Input_Output {

    public static void printInputAsOutput(Scanner sc) throws InputMismatchException {
        try {
            System.out.println("Enter any integer value ");
            int input = sc.nextInt();
            System.out.println("The input value is : " + input);
        }catch(InputMismatchException e){
            System.out.println("Please enter only Integer value");
        }
    }
}
