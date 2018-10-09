/**
 * @(#)Largest.java
 * @CS 110 Sample Program for example4.adb
 * @9-28-08
 * @A sample program to determine the largest value in a list of
 * @ integer values entered from the keyboard
 */

import java.util.Scanner;

public class Largest 
{
 public static void main (String[] args) 
 {
  int num;
  int x;
  int largest = 0;  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("How many integers are you going to enter?");
  num = sc.nextInt();
  
  for (int i = 1; i <= num; i++)
  {
   if (i == 1)
    System.out.println("Enter the first integer: ");
   else if (i == num)
    System.out.println("Enter the last integer: ");
   else
    System.out.println("Enter the next integer: ");
    
   x = sc.nextInt();   
   if (x >= largest)
    largest = x;
  }  
  System.out.println("The largest integer entered was " + largest);  
 }    
}