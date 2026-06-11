//Print Numbers from 1 to 20 Except Multiple of 3.
public class SkipMultipleOf3{
    public static void main(String[] args){
        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
} 