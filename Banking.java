import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 3500.0;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your consumer number: ");
        String consumerNumber = scanner.nextLine();

        System.out.println("\nHello, " + name + " (Consumer No: " + consumerNumber + ")");
        System.out.println("Your current balance is: INR " + balance);

        System.out.print("Do you want to Withdraw or Deposit? (W/D): ");
        String choice = scanner.next().toUpperCase();

        switch (choice) {
            case "W":
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful!");
                } else {
                    System.out.println("Insufficient Balance.");
                }
                break;

            case "D":
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                balance += depositAmount;
                System.out.println("Deposit successful!");
                break;

            default:
                System.out.println("Invalid option selected.");
        }

        System.out.println("Updated balance: INR " + balance);
        scanner.close();
    }
}
