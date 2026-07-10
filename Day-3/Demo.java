final class Demo {
}
//class A extends Demo{} //Not Allowed:
class A{
    final void show(){
        System.out.println("BIET COLLEGE");
    }
}
class B extends A{
    //void show(); //Cannot override a final method
    final int x = 200;
    //x = 100; //Cannot modify a final variable
    static void display(final int x){
        
        System.out.println("The value of x is: " + x);
    }

}
