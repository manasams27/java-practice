//Multiple catch block.
import java.util.Scanner;
public class MultipleException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};
        try{
            System.out.println("Enter a value:");
            int a  = sc.nextInt();
            System.out.println("Enter b value:");
            int b = sc.nextInt();
            int result = a/b;
            System.out.println(result);
            System.out.println("Enter array Index (0-4):");
            int index = sc.nextInt();
            System.out.println(arr[index]);
        }catch(ArithmeticException e){
            System.out.println("divide by 0 not possible");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid");
        }
        sc.close();
    }
    
}
