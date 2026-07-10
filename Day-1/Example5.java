//Print Multiplication table of a given number.(input from users).
import java.util.Scanner;
class Example5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n values:");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println(n*i);
        }
    }
}