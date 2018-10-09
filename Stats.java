/**
 * @(#)Stats.java
 * @CS 110 Sample Program
 * @9-28-08
 * @A sample program to calculate the statistics
 */

import java.util.Scanner;

public class Stats 
{
 public static void main (String[] args) 
 {
  int x;
  int n = 0;
  double avg = 0.0;
  double sumSq = 0.0;
  double stdDev = 0.0;
  Scanner sc = new Scanner(System.in);
  
  System.out.println
   ("Calculate the average & Std deviation of test scores");
  System.out.println();
  System.out.println("Enter the first test score: ");
  x = sc.nextInt();
  
  while (x >= 0)
  {
   avg = avg + (double)x;
   sumSq = sumSq + (double)(x*x);
   n++;
   System.out.println
    ("Enter next test score (a negative number to quit)");
   x = sc.nextInt();   
  }
 
  if (n != 0)
    avg = avg/(double)n;
  stdDev = Math.sqrt(sumSq/(double)n - avg * avg);
  System.out.println("The number of values enter is " + n);
  System.out.println();
  System.out.println("The average test score is " + avg);
  System.out.println();
  System.out.println("The standard deviation is " + stdDev);  
 }    
}