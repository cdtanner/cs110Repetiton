/**
 * @(#)Ckbok.java
 * @CS 110 Sample Program 
 * @9-27-08
 * @ Maintaining a check book
 */

import java.util.Scanner;

public class Ckbook 
{
 static final double CHECKCHARGE = 15.0; 
 static Scanner sc = new Scanner(System.in);
 
 
 public static void main (String[] args) 
 {
  double balance;
  double amount;
  char transType;

  balance = getBeginBal();
  System.out.println("Begin Balance: " + balance);
  transType = getTransType();
  
  while(!(transType == 'E' || transType== 'e'))
  {    
       amount = getTransAmount();
       
       if (transType== 'D' || transType== 'd')
         balance = deposit(balance, amount);
       else if (transType == 'C' || transType == 'c')
         balance = check(balance, amount);          
 
       transType = getTransType();
  } 
 }
    
 public static double getBeginBal()
 {
     double begBal;
     System.out.println("Enter your begining balance: ");
     begBal = sc.nextDouble();     
     return begBal;
 }
    
 public static char getTransType()
 {
   char transType;
   boolean valid = false;
   do
   {
     System.out.println("Enter Transaction Type: ");
     System.out.println("C check, D deposit, E end ");          
     transType = sc.next().charAt(0);
     if (transType=='E' || transType=='e' || 
         transType== 'C' || transType == 'c' || 
         transType == 'D' || transType == 'd')
       valid = true;
      else
       System.out.println("Please enter a C, D, or E");
     }while (!valid);
 
     return transType;
 }
    
 public static double getTransAmount()
 {
     double transAmount;      
     System.out.println("Enter Amount: ");
     transAmount = sc.nextDouble();

     return transAmount;     
 }
    
 public static void displayTrans
     (String transType, double amount, double balance)
{
     System.out.println();
     System.out.println("Transaction Type: " + transType);
     System.out.println("Transaction Amount: " + amount);
     System.out.println("Balance: " + balance); 
}
    
public static double deposit(double balance, double amount)
{
     balance = balance + amount;
     displayTrans("D", amount, balance);
     
     return balance;
}
    
public static double insuffFunds(double balance)
{
     System.out.println();
     System.out.println("Insufficient funds -- $15 charge ");
     balance = balance - CHECKCHARGE;
     displayTrans(" ", CHECKCHARGE, balance);
     
     return balance;
}    
    
public static double check(double balance, double amount)
{
     if (amount > balance)
       balance = insuffFunds(balance);
     else
     {
       balance = balance - amount;
       displayTrans("C", amount, balance);
     }
     return balance;
}    
}
