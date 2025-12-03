package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Problem Statement: Given an integer N, print the following pattern.

1
12
123
1234
12345

 */
public class Pattern3 {
   public static void printPattern3(Scanner sc) throws InputMismatchException {
       try{
           System.out.println("Enter the number of rows to be print in Integer");
           int input=sc.nextInt();
           for(int i=1;i<=input;i++){
               for(int j=1;j<i+1;j++){
                   System.out.print(j);
               }
               System.out.println();

           }
       }catch (InputMismatchException e){
           System.out.println("Give only Integer value as an input");
       }
   }
}
