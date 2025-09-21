import tools.Calculator;
public class UnderstandingOfMethods {
    // instance variables each account as its own values
    private String accountHolder;
    private double accountBalance;

    // static variable, for all the accounts this is same
    public static double interestRate = 5.0;

    //constructor
    public UnderstandingOfMethods(String name, double bal){
        this.accountHolder = name;
        this.accountBalance = bal;
    }

    //instance method -> depends on each account and user
    public void deposit(double amount){
        accountBalance += amount;
        System.out.println(accountHolder + " deposited " + amount + " Updated Balance " + accountBalance);
    }

    //instance method -> depends on objet's balance
    public void withdraw(double amount){
        if(accountBalance >= amount) {
            accountBalance -= amount;
            System.out.println(accountHolder + " Withdraw Amount " + amount + "Updated Balance " + accountBalance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    //instance method -> depends on object's balance
    public double getAccountBalance(){
        return accountBalance;
    }

    public static void setInterestRate(double rate){
        interestRate = rate;
        System.out.println("Updated interest rate " + interestRate);
    }

    public static void main(String[] args) {
        UnderstandingOfMethods account1 = new UnderstandingOfMethods("Ramki", 5000);
        UnderstandingOfMethods account2 = new UnderstandingOfMethods("Santosh", 10000);
        Operations ope1 = new Operations();
        // Created object from another class
        ope1.loginAuthentication("Ram","123");
        // Created object from other package
        Calculator calc1 = new Calculator();
        calc1.display();

        account1.deposit(1500);
        account2.withdraw(1500);

        System.out.println("Balance of Ramki " + account1.getAccountBalance());
        System.out.println("Balance of Santosh " + account2.getAccountBalance());

        UnderstandingOfMethods.setInterestRate(7.5);
    }
}
