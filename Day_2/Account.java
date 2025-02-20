public class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber , double balance){
        if(accountNumber == null || accountNumber.isEmpty()){
            System.out.println("Error: Account number cannot be null or empty.");
            return;
        }else if(balance <= 0 ){
            System.out.println("Error: Balance cannot be negative or Zero.");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        if (accountNumber != null) {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args){
        Account account2 = new Account("123", 0);
        account2.display();
    }
}
