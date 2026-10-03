import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int secretNumber=random.nextInt(100)+1;
        int guess=0;
        int attempts=0;
        System.out.println("*** Number Guessing Game ***");
        System.out.println("Guess a number between 1 and 100");
        while(guess!=secretNumber){
            System.out.println("Enter your guess:");
            if(!sc.hasNextInt()){
                System.out.println("Please enter a valid integer");
                sc.next(); 
                continue;
            } 
             guess = sc.nextInt();
             if(guess<1 || guess>100){
                  System.out.println("Please enter a number between 1 and 100");
                  continue;
                   }
                    attempts++;
                     if(guess<secretNumber){
                        System.out.println("Too low! Try again.");
                         }else if(guess>secretNumber){
                             System.out.println("Too high! Try again.");
                              }else{
                                 System.out.println("Congratulations! You've guessed the number " + secretNumber + " in " + attempts + " attempts.");
                }
        }
        sc.close();
    }
}