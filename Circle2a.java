/**
 * @(#)Circle2a.java
 * @CS 110 Sample Program
 * @9-28-08
 * @A sample program to calculate the circumference and area
 */


import java.util.Scanner;

public class Circle2a 
{
 static final double PI = 3.14159;
 static Scanner sc = new Scanner(System.in);

 public static void main (String[] args) 
 {
  double area, circum;
  double radius;
  
  radius = getRadius();   
  while (radius <= 0.0)
  {    
   System.out.println("Illegal radius value must be > 0,");
   System.out.println(" please re-enter.");
   radius = getRadius();
  }
  
  circum = calcCircum(radius);
  area = calcArea(radius);  
  displayResult(radius, area, circum);
 } 

 public static double calcArea(double inRadius)
 {
     double area;
     area = PI * inRadius * inRadius;
     return area; 
 }
 
 public static double calcCircum(double inRadius)
 {
     double circum;
     circum = 2.0 * PI * inRadius;
     return circum; 
 }
 
 public static double getRadius()
 {
     double inRadius;
     System.out.println
         ("Enter the radius of the circle: ");
     inRadius = sc.nextDouble();
     return inRadius;
 } 

 public static void displayResult
  (double inRadius, double areaCircle, double circumCircle)
 {
  System.out.println();
  System.out.println
   ("The Circumference of a Circle whose radius is " 
   + inRadius + " is " + circumCircle);
  System.out.println();
  System.out.println
   ("The Area of a Circle whose radius is " + inRadius 
    + " is " + areaCircle); 
 } 
}