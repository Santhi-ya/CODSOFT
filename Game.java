import java.util.Scanner;
import java.util.Random;
public class Game
{
 public static void main(String[] args)
 {
   Scanner s= new Scanner (System.in);
   Random r = new Random();
   int lowerbound=0;
   int upperbound=100;
   System.out.println("Guess the number game!");
   System.out.println("I have choosen a number from 1 to 100 .Try to find it!");
   int Mynumber=r.nextInt(upperbound-lowerbound+1);
   int round=0;
   int maxround=5;
   int score=0;

   while(round<maxround)
   {
     
    
     round++;
     System.out.println("Guess the number I choosen:");
     int playerguess= s.nextInt();
     if(Mynumber==playerguess)
     {
       System.out.println("You won!");
       score+=50;
     }
     else if(Mynumber<playerguess)
     {
       System.out.println("Try a lower number,Your Guess is too high");
       score+=1;
       
     }
     else
     {
       System.out.println("Try a higher number ,Your guess is too low");
       score+=1;
     }
     
     if(round==maxround)
     {
       System.out.println("Your chance is over.play again.");
     }
   }
   
   System.out.println("Your attempt:"+round);
   System.out.println("Your Score:"+score);
   System.out.println("Thank you for playing ");
   
 }
}