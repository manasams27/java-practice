import java.util.Scanner;
public class StopOnZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number:");
            int n = sc.nextInt();

            if(n == 0){
                break;
            }
            System.out.println(n);
        }
        System.out.println("Program Ended");
        sc.close();
    }
}
