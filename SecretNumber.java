//Guess the Secret Number.
import java.util.Scanner;
public class SecretNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int secretNumber = 7;
        while(true){
            System.out.println("Enter your guess:");
            int guess = sc.nextInt();

            if(guess == secretNumber){
                System.out.println("Correct!");
                break;
            }
            System.out.println("Not correct! try again");
        }
        sc.close();
    }
}