public class ThisKeywordDemo {
    int i;
    void change(int i){
        this.i = i;
    }
    void display(){
        System.out.println("The value of i is " + i);
    }
    public static void main(String[] args){
        ThisKeywordDemo t = new ThisKeywordDemo();
        t.change(20);
        t.display();
    }
}