/**
 * @(#)Words.java
 * @CS 110 Sample Program 
 * @9-14-08
 * @Determines the average length of 5 input words using methods
 */

import java.util.Scanner;

public class Words 
{   
 static Scanner sc = new Scanner(System.in); 
  
 public static void main (String[] args) 
 {
  int length; 
  int totalLength = 0;
  float ave;

  for (int i=0; i<5; i++)
  {   
   length = getLength();
   totalLength += length;
  }
  ave = average(totalLength);
  displayResult(ave);  
 }
 
 //Input the word and get the length
 public static int getLength()
 {
     int len;

     System.out.println();
     System.out.println("Enter a word: ");
     len = sc.next().length();
     return len;
 }
 
 //Calculate the average length of 5 words
 public static float average(double totalLength)
 {  
     return (float) (totalLength) / 5;  
 }
 
 //Display the result
 public static void displayResult(float ave)
 {
  System.out.println();
  System.out.println("The average word length is " 
   + ave);
 }
}