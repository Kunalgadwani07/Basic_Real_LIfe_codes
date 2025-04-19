import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String description;
    double amount;

    public Expense(String dis, double amt) {
        dis = description;
        amt = amount;
    }

    public String toString() {
        return description + ": Rs" + amount;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        ArrayList<Expense> expenses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Daily Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Total Expense");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter expense description: ");
                    String desc = scanner.nextLine();
                    System.out.print("Enter amount: ₹");
                    double amount = scanner.nextDouble();
                    expenses.add(new Expense(desc, amount));
                    System.out.println("✅ Expense added.");
                    break;

                case 2:
                    if (expenses.isEmpty()) {
                        System.out.println("⚠️ No expenses recorded.");
                    } else {
                        System.out.println("\n--- List of Expenses ---");
                        for (Expense e : expenses) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Expense e : expenses) {
                        total += e.amount;
                    }
                    System.out.println("💰 Total Spent: ₹" + total);
                    break;

                case 4:
                    System.out.println("👋 Exiting. Have a great day!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
