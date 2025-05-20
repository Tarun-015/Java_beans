import java.util.Scanner;

public class BankSystem {   //let initial balance be 1000(student-account)
    int accountNo;
    String name;
    int deposit;
    int withdraw;
    int balance = 1000;

    void depositing() {
        System.out.println("Amount deposited: " + deposit);
        balance += deposit;
    }

    void withdrawing() {
        if (withdraw > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            System.out.println("Amount withdrawn: " + withdraw);
            balance -= withdraw;
        }
    }

    void balancing() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankSystem cust = new BankSystem();

        System.out.print("Enter account no.: ");
        cust.accountNo = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter customer name: ");
        cust.name = sc.nextLine();

        System.out.print("Purpose of visit (deposit / withdraw / checking balance): ");
        String purpose = sc.nextLine();

        if (purpose.equalsIgnoreCase("deposit")) {
            System.out.print("Amount to be deposited: ");
            cust.deposit = sc.nextInt();
            cust.depositing();
        } 
        else if (purpose.equalsIgnoreCase("withdraw")) {
            System.out.print("Amount to be withdrawn: ");
            cust.withdraw = sc.nextInt();
            cust.withdrawing();
        } 
        else if (purpose.equalsIgnoreCase("checking balance")) {
            cust.balancing();
        } 
        else {
            System.out.println("Invalid option.");
        }

        sc.close();
    }
}
