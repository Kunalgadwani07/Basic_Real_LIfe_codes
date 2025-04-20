import java.util.ArrayList;
import java.util.Scanner;

public class Delivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();
        String[] products = {"Soap", "Toothbrush", "Shampoo", "Toothpaste", "Towel"};

        System.out.println("Welcome to the Online Delivery Service!");
        System.out.print("Please enter your name: ");
        String customerName = scanner.nextLine();

        System.out.println("Hello, " + customerName + "! What would you like to do?");
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add item to cart");
            System.out.println("2. View cart");
            System.out.println("3. Place order");
            System.out.println("4. Contact customer care");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Available products:");
                    for (int i = 0; i < products.length; i++) {
                        System.out.println((i + 1) + ". " + products[i]);
                    }
                    System.out.print("Enter the number of the product to add to the cart: ");
                    int productChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (productChoice > 0 && productChoice <= products.length) {
                        String selectedProduct = products[productChoice - 1];
                        cart.add(selectedProduct);
                        System.out.println(selectedProduct + " has been added to your cart.");
                    } else {
                        System.out.println("Invalid product choice. Please try again.");
                    }
                    break;

                case 2:
                    System.out.println("Your cart contains:");
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else {
                        for (String cartItem : cart) {
                            System.out.println("- " + cartItem);
                        }
                    }
                    break;

                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty. Add items before placing an order.");
                    } else {
                        System.out.println("Placing your order...");
                        System.out.println("Order placed successfully! Thank you for shopping with us.");
                        cart.clear(); // Clear the cart after placing the order
                    }
                    break;

                case 4:
                    System.out.println("Customer Care: How can we assist you?");
                    System.out.println("1. Order issue");
                    System.out.println("2. Refund request");
                    System.out.println("3. General inquiry");
                    System.out.print("Enter your issue type: ");
                    int issueType = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Thank you for reaching out. Our team will contact you shortly.");
                    break;

                case 5:
                    System.out.println("Thank you for using our service. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}