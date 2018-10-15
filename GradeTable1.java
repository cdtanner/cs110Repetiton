/**
 * @(#)GradeTable1.java
 * @CS 110 Sample Program
 * @10-12-18
 * @Produces a grades Table, sending its output to a file
 */

import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GradeTable1 
{
 static Scanner sc = new Scanner(System.in); 
 
 public static void main (String[] args) throws FileNotFoundException
 {
  PrintWriter outFile = new PrintWriter("gradeTable1.txt");
  
  int noOfStud;
  char grade;
  double score = 0.0;
  String name;
  double classSum = 0.0;
  double average = 0.0; 
  
  System.out.println("Please enter the number of students: ");
  noOfStud = sc.nextInt();
  
  outFile.println("Student     Test1  Test2  Test3  Test4  "
                    + "Test5 Average Grade");
  for (int i = 1; i <= noOfStud; i++)
  {
    double total = 0.0;
    System.out.println();
    name = getStudName();
    outFile.printf("%10s ", name);
    for (int j = 1; j <= 5; j++)
    {
      score = getGrade(j);
      total += score;
      outFile.printf("%6.2f ", score);    
    }
    average = calculateAverage(total, 5);
    classSum = classSum + average;
    grade = calculateGrade(average);
    outFile.printf("%6.2f %4c", average, grade);
    outFile.println();
  }
  outFile.println();
  outFile.println("Class Average = " + (classSum/noOfStud));
  outFile.close();
}
    
    public static String getStudName()
    {
      String str;
      System.out.println();
      System.out.println("Please enter the name of the student: ");
      str = sc.next();
      return str;
    }
    
    public static double getGrade(int i)
    {
     double grade;
     System.out.println();
     System.out.println("Please enter the score for Class" + i);
     grade = sc.nextDouble();
     return grade;
    }
    
    public static double calculateAverage(double total, int numValues)
    {  
      double average = 0.0;
      if (numValues > 0)
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