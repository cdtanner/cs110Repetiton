/**
 * @(#)GradeTable2.java
 * @CS 110 Sample Program
 * @10-12-18
 * @Produces a grades Table using taking its input from a file and
 * @sending its output to a file
 */

import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GradeTable2 
{
 static Scanner sc = new Scanner(System.in); 
 
 public static void main (String[] args) throws FileNotFoundException
 {
  Scanner inFile = new Scanner(new File("inputGrade.txt"));
  PrintWriter outFile = new PrintWriter("gradeTable2.txt");
  
  double total;  
  char grade;
  double score = 0.0;
  String name;
  double classSum = 0.0;
  double average = 0.0; 
  int numStus=0;
  
  
  outFile.println("Student     Test1  Test2  Test3  Test4  "
   + "Test5 Average Grade");
  
  while (inFile.hasNext())
  {
    total = 0.0;
    numStus++;
    name = inFile.next();
    outFile.printf ("%10s", name);
    for (int i=0; i< 5; i++)
    { score = inFile.nextDouble();
      total += score;
      outFile.printf("%6.2f",score);
    }
    
    average = calculateAverage(total, 5);
    classSum += average;
    grade = calculateGrade(average);
    outFile.printf("%6.2f %4c", average, grade);
    outFile.println();
  }
  
  outFile.println();
  outFile.println("Class Average = " + (classSum/numStus));
  inFile.close();
  outFile.close();
  
 }    
    
    public static double calculateAverage(double total, int numValues)
    {  
      double average=0.0;
      if(numValues >0)
        average = total/numValues;
      return average; 
    }
    
    public static char calculateGrade(double ave)
    {
     char grade;
     if (ave >= 90.0)
       grade = 'A';
     else if (ave >= 80.0)
       grade = 'B';
     else if (ave >= 70.0)
       grade = 'C';
     else if (ave >= 60.0)
       grade = 'D';
     else
       grade = 'F';
     return grade;
    }
}