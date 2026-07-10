public class BankAccount{
    void calculateInterest(){
        System.out.println("Interest 4%");
    }
}
class SavingAccount extends BankAccount{
    void calculateInterest(){
        System.out.println("Interest 7%");
    }
    void display(){
        super.calculateInterest();
        this.calculateInterest();
    }
    public static void main(String[] args){
        SavingAccount account = new SavingAccount();
        account.display();
    }
}