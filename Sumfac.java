/**
 * @(#)Sumfac.java
 * @CS 110 Sample Program
 * @9-28-08
 * @Determine sums and factorials
 */

import java.util.Scanner;

public class Sumfac 
{
 static Scanner sc = new Scanner(System.in);
 
 public static void main (String[] args) 
 {
  int seed, sum, fac;
  
  seed = welcomeScreen();
  while (seed > 0)
  {   
   sum = 0;
   for (int i = 1; i <= seed; i++)
   {
    sum = sum + i;
   }
   System.out.println("The sum of 1-" + seed + " = " + sum);   
   
   fac = 1;
   for (int i = 2; i <=seed; i++)
   {
    fac = fac * i;
   }
   System.out.println("           " + seed + "!= " + fac);
   seed = welcomeScreen();
  }  
 }
    
 public static int welcomeScreen()
 {
     int inValue;
     System.out.println("Determine the sum of the numbers 1-?");
     System.out.println("and the factorial of ?");
     System.out.print("Enter a number < 13, 0 to end");
     inValue = sc.nextInt();
     return inValue;
 }    
}