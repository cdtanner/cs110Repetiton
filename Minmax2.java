/**
 * @(#)Minmax2.java
 * @CS 110 Sample Program 
 * @9-27-08
 * @finds the high, low, average score, and the number of
 * @ A's, B's, etc. in a set of scores which is terminated
 * @ with a sentinel of -1
 */

import java.util.Scanner;

public class Minmax2 
{
 static Scanner sc = new Scanner(System.in);
 
 public static void main (String[] args) 
 {
   int count= 0, total = 0, high = 0, low = 100;
   double average = 0.0;
   int examScore = 0;
   int numA = 0, numB = 0, numC = 0, numD = 0, numF = 0;   
   
   examScore = getExamScore();
   while (examScore !=-1)
   {       
   
    total = total + examScore;
    count++;  
         
    if (examScore > high)
     high = examScore;
    if (examScore < low)
     low = examScore;
    if (examScore > 89)
      numA++;
       else if (examScore >79)
         numB++;
       else if (examScore > 69)
         numC++;
        else if (examScore > 59)
          numD++;
           else
             numF++;
    examScore = getExamScore();
   }   
   
   if (count != 0)
       average = (double) total / count;
   displayResults(high, low, average);
   System.out.println("A  B  C  D  F");
   System.out.println(numA + "  " + numB + "  " 
    + numC + "  " + numD + "  " + numF);     
 }
    
public static int getExamScore ()
{
     int score;
     System.out.println("Enter exam score, -1 to end:");
     score = sc.nextInt();     
     return score;
}
    
public static void displayResults
     (int max, int min, double average)
{
     System.out.println("The highest score was: " + max);
     System.out.println("The lowest score was: " + min);
     System.out.println("The average score was: " + average);
}
}