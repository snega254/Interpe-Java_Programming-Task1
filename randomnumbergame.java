import java.util.Scanner;
import java.util.Random;
class randomnumbergame{
   public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String play = "yes";
    while(play.equalsIgnoreCase("yes")){
    Random r = new Random();
    int randomnum = r.nextInt(100)+1;
    int guess = -1;
    int trial = 0;
    while(guess!=randomnum){
        System.out.print("Guess the number between 1 and 100 : ");
        guess = sc.nextInt();
        trial++;
        if(guess==randomnum){
           System.out.println("You are Correct");
           System.out.println("You have tried "+trial+" times only.");
        }
        else if(guess>randomnum){
            System.out.println("Too High! Try Again.");
        }
        else if(guess<randomnum){
            System.out.println("Too Low! try Again");
        }
    }
    System.out.print("Do you want to play again? (yes/no): ");
    play = sc.next();
   }
   System.out.println("Thank you for playing!");
   sc.close();
}
}