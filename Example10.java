//prime Numbers.
import java.util.Scanner;
class Example10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }else{
            for(int i=2; i<n; i++){
                if(i%2 == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("prime");
        }else{
            System.out.println("not a prime");
        }
    }
}