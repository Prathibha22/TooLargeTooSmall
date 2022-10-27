/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by Prathibha on 10/26/2022
 */
import sun.lwawt.macosx.CInputMethod;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args){
        //local variable to keep track of number of guesses
        int count=1;
        int guess;
       //Creating a mystery number
        Random random=new Random();
        int mysteryNum=random.nextInt(100)+1;
        System.out.println(mysteryNum);
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please select a number to guess mystery number between 1 and 100");
            guess=input.nextInt();
            if(guess==mysteryNum)
                System.out.println("Congratulations your find the mystery number in "+count+ " attempts");
            else if(guess>mysteryNum) {
                System.out.println("your guess is bigger than mystery number");
                count++;
            }
            else {
                System.out.println("your guess is less than mystery number");
                count++;
            }
        }while (mysteryNum!= guess);


    }
}
