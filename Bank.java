import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> accounts;

    //HashMap is used to store the bank accounts and get account information based on name.
    public Bank(){
        this.accounts = new HashMap<>();
    }

    //Method to display the list of all the accounts
    public void AccountList(){
        System.out.println("List of Bank Accounts: ");
        for ( String accountName : accounts.keySet()){
            System.out.println(accountName);
        }
    }

    //Method to display the details of Selected Account
    public void AccountInformation(String name){
        BankAccount account = accounts.get(name);
        System.out.println("Account Name: " + account.getName());
        System.out.println("Balance : " + account.getBalance());
        System.out.println("Transaction : " + account.getTransaction());
    }

    //Method to add the transactions to the selected account
    public void addTransaction(String name, double amount){
        BankAccount account = accounts.get(name);
        account.addTransaction(amount);
        System.out.println("Added Transaction Successfully!!");
    }

    //Method to remove a specific account 
    public void removeAccount(String name){
        accounts.remove(name);
        System.out.println("Removed Account Successfully!!");
    }

    //Method to add a new account to the bank 
    public void addAccount(String name, double balance){
        BankAccount newAccount = new BankAccount(name, balance);
        accounts.put(name, newAccount);
    }

}
