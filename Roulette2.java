/**
 * @(#)Roulette.java
 * @CS 110 Sample Program
 * @do while loops
 */

import java.util.Scanner;

public class Roulette2 
{
  
 public static void main (String[] args) 
 {
  final int EVEN =0;
  final int ODD =1;
  final int NUMBER =2;
  int betAmount;
  int payOut = 0;
  int bet = 0;
  int numValue = 0;
  int numSpinned;
  double random;
  int totalBet = 0;
  int totalTimes = 0;
  boolean won= false;
  char lucky;
    
  Scanner sc = new Scanner(System.in);
  
  do
  {
    do
    {
      System.out.println("Enter your bet: (0-even, 1-odd, 2-number)");
      bet = sc.nextInt();
    }while (bet != EVEN && bet != ODD && bet != NUMBER);

    if (bet == NUMBER)
    {
      System.out.println("Enter the value you with to bet on: ");
      numValue = sc.nextInt();
    }
    
    System.out.println("Enter the amount of your bet: ");
    betAmount = sc.nextInt();
    totalTimes++;
    numSpinned = (int) Math.random()*37;
    System.out.println("The number shown on the wheel is: " + numSpinned);
   
    switch (bet)
    {
      case EVEN:
        if (numSpinned != 0 && (numSpinned%2)==0)
        {
          payOut = betAmount * 2;
          won = true;
        }
        break;
    case ODD:
        if (numSpinned != 0 && (numSpinned%2)!=0)
        {
           payOut = betAmount * 2;
           won = true;
        }
        break;
    case NUMBER:
        if (numSpinned == numValue)
        {
           payOut = betAmount * 35;
           won = true;
        }
        break;
    default:
        won = false;
    }
    
    if (won)
    {
      System.out.println("You have won $" + payOut);
      totalBet += payOut;
    }
    else
      totalBet -= betAmount;
    
    if (totalBet >= 0)
      System.out.println("You are up $" + totalBet);
    else
      System.out.println("You are down $" + totalBet * (-1));
  
    System.out.println("Wish to try your luck again?? (y/n)");
    lucky = sc.next().charAt(0);   
  }while (lucky == 'y' || lucky == 'Y');
  
  System.out.println("You played the wheel " + totalTimes + " times");
  }   
}