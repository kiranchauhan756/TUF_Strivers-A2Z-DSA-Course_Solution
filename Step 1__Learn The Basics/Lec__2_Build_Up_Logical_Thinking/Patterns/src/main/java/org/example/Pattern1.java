package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Problem Statement: Given an integer N, print the following pattern.

*****
*****
*****
*****
*****

 */
public class Pattern1 {
   public static void printPattern1(Scanner sc) throws InputMismatchException {
       try{
           System.out.println("Enter the number of rows to be print in Integer");
           int input=sc.nextInt();
           for(int i=1;i<=5;i++){
               for(int j=1;j<=5;j++){
                   System.out.print("*");
               }
               System.out.println();
           }
       }catch (InputMismatchException e){
           System.out.println("Give only Integer value as an input");
       }
   }
}
