import java.util.*;
public class NumberGuessing
{
    public static void main(String[]args){
        int randomNumber = (int)(Math.random()*99 + 1);
        int guess = Integer.parseInt(args[0]);
        if(guess<1 || guess>99){
            System.out.println("You must guess a number between 1 and 99 (inclusive).");
        } else if(guess != randomNumber){
            System.out.printf("Oops, it's actually %d, do well the next time!\n", randomNumber);
        } else {
            System.out.println("Correct answer, well done!");
        }
    }
}
