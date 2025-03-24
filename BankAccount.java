import java.util.ArrayList;
import java.util.List;

public class BankAccount{
    private String name;
    private double balance;
    private List<Double> transactions;
    
    //Initializing bank account 
    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public List<Double> getTransaction(){
        return transactions;
    }

    //Method to add the transaction to the account and change the balance amount
    public void addTransaction(double amount){
        transactions.add(amount);
        balance += amount;
    }
}