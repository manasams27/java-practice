//Create an array of 5 elements Handle ArrayIndexOutOfBoundsException.
import java.util.Scanner;
public class ArrayIndexAccess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};
        try{
            System.out.println("Enter array index elements (0-4):");
            int index = sc.nextInt();
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid");
        }
        sc.close();

    }
}
