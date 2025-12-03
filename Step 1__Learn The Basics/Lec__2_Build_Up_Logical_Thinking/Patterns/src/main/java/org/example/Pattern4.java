package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Problem Statement: Given an integer N, print the following pattern.

1
22
333
4444
55555

 */
public class Pattern4 {
   public static void printPattern4(Scanner sc) throws InputMismatchException {
       try{
           System.out.println("Enter the number of rows to be print in Integer");
           int input=sc.nextInt();
           for(int i=1;i<=input;i++){
               for(int j=1;j<i+1;j++){
                   System.out.print(i);
               }
               System.out.println();

           }
       }catch (InputMismatchException e){
           System.out.println("Give only Integer value as an input");
       }
   }
}
