import java.util.Scanner;

public class Main {
    static Bank bank = new Bank();
    static Scanner select = new Scanner(System.in);

    public static void main(String[] args){
        //Creating Default bank accounts with initial balance.
        bank.addAccount("Arfah",200);
        bank.addAccount("Aadil",100);

        //While loop is used to provide the options continuously.
        while(true){
            //Displaying the main menu
            System.out.println("\nBanking Application Menu:");
            System.out.println("\n1. List of all bank accounts.");
            System.out.println("\n2. View an individual bank account.");
            System.out.println("\n3. Add new transaction.");
            System.out.println("\n4. Remove bank account.");
            System.out.println("\n5. Create new account.");
            System.out.println("\n6.Exit");
            System.out.println("\nSelect your option:");


            /*Taking the user input and used nextLine() rather than nextInt() since the nextInt() can
            sometimes skip over the next input iteration. Hence, it's better to convert string into int.*/
            String selectedString = select.nextLine();
            int selected = Integer.parseInt(selectedString);
            

            
            //used else-if to handle different menu options and call the respective methods. 
            if(selected == 1){
                //List of all bank accounts
                bank.AccountList();
            }
            else if(selected == 2){
                //View the details of an individual bank account
                System.out.println("\nEnter the Name:");
                String accountName = select.nextLine();
                bank.AccountInformation(accountName);
            }
            else if(selected == 3){
                //Add a new transaction to an account
                System.out.println("\nEnter the Name:");
                String accountName = select.nextLine();
                System.out.println("Enter the Transaction Amount:");
                String amount = select.nextLine();
                Double amountDouble = Double.parseDouble(amount);
                bank.addTransaction(accountName, amountDouble);
            }
            else if(selected == 4){
                //Remove a bank account
                System.out.println("\nEnter the Account Name to be removed:");
                String accountName = select.nextLine();
                bank.removeAccount(accountName);
            }
            else if(selected == 5){
                //Create a new account
                System.out.println("\nEnter the name:");
                String accountName = select.nextLine();
                System.out.println("Enter the Initial Balance:");
                String balance = select.nextLine();
                Double balanceDouble = Double.parseDouble(balance);

                bank.addAccount(accountName, balanceDouble);
                System.out.println("Account Created Successfully!!");
            }
            else if(selected == 6){
                //Exiting the program
                System.out.println("Thank You! Exiting the Program!!");
                System.exit(0);
            }
            else{
                System.out.println("Invalid Input! Try again!");
            }
        }
    }
}
