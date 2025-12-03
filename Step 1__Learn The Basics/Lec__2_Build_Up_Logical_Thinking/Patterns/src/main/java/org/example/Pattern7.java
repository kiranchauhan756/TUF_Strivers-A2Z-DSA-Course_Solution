package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Problem Statement: Given an integer N, print the following pattern.

    *
   ***
  *****
 *******
*********

 */
public class Pattern7 {
   public static void printPattern7(Scanner sc) throws InputMismatchException {
       try{
           System.out.println("Enter the number of rows to be print in Integer");
           int input=sc.nextInt();
           int space=input-1,star=1;
           for(int i=1;i<=input;i++){
               for(int j=1;j<=space+star;j++){
                   if(j<=space){
                       System.out.print(" ");
                   }
                   else{
                       System.out.print("*");
                   }

               }
               star+=2;
               space--;
               System.out.println();


           }
       }catch (InputMismatchException e){
           System.out.println("Give only Integer value as an input");
       }
   }
}
