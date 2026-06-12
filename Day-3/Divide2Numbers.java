//Write a program that takes two integers from the user and divides the.(Exception Handling).
import java.util.Scanner;
public class Divide2Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
         System.out.println("Enter a value:");
         int a = sc.nextInt();
         System.out.println("Enter b value:");
         int b = sc.nextInt();
         int result = a/b;
         System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Divide by 0 not possible");
        }
        sc.close();
    }
}