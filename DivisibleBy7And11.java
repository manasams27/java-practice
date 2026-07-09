//Find First Number Divisible by 7 and 11.
public class DivisibleBy7And11{
    public static void main(String[] args){
        for(int i=1; i<=1000; i++){
            if(i%7 == 0 && i%11 == 0){
                System.out.println("FirstNumber is " + i);
                break;
            }
        }
    }
}