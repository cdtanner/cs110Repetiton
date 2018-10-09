/** CS 110 sample Program Nested loops*/

import java.util.Scanner;

public class GuessingGame
{
  
  public static void main (String [] args)
  {
    char play;
    Scanner sc = new Scanner (System.in);
    int num, guess;
    
    System.out.print ("do you wish to play: Y/N ");
    play = sc.next().charAt(0);
    while (play == 'y' || play == 'Y')
    {
      num = (int) (Math.random() *10) +1;
      do
      {
        System.out.print("I'm thinking of a number for 1-10, What's your guess? ");
        guess= sc.nextInt();
        if (num == guess)
          System.out.println ("Good Guess!!!!");
        else System.out.println ("sorry, guess again");
      } while (num != guess);
      
     System.out.print ("do you wish to play: Y/N ");
     play = sc.next().charAt(0);
    }
    System.out.println("Thanks for playing");
  }
}
