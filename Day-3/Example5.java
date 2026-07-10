//write a program demonstrating the use of finally.
public class Example5 {
    public static void main(String[] args){
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Divide by zero not possible");
        }finally{
            System.out.println("Hiiii");
        }
    }
    
}
