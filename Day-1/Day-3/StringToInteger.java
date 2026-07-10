//String to Integer Conversion.(Number Format Exception).
import java.util.Scanner;
public class StringToInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number:");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Invalid");
        }
        sc.close();

    }
}
