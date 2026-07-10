//Palindrome Number.
import java.util.Scanner;
class Example8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while(n > 0){
            int lastDigit = n%10;
            reverse = reverse * 10 + lastDigit;
            n = n/10;
        }
        if(original == reverse){
            System.out.println("palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}