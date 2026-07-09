public class Account{
    int accountNumber;
    static int totalAccounts;
    Account(){
        totalAccounts++;
        accountNumber = totalAccounts;
    }
    static void showTotalAccounts(){
        System.out.println("Total Accounts: " + totalAccounts);
    }
    public static void main(String[] args){
        new Account();
        new Account();
        new Account();
        new Account();
        new Account();
        new Account();
        showTotalAccounts();
    }
    //static initializer block
    static{
        System.out.println("Anusha");
        System.out.println("Database");
        System.out.println("Internet");
        System.out.println("Excel");
        System.out.println("Settings");
    }
    {
        System.out.println("IIB");
    }
    //Static->IIB->main
}
