import java.util.Scanner;
class ShoppingCart {
    public static void menu() {
        //Items
        System.out.println("\n===== E-Cart =====");
        System.out.println("1. Laptop - Rs 89800");
        System.out.println("2. Mouse - Rs 2300");
        System.out.println("3. Keyboard - Rs 2050");
        System.out.println("4. Headphones - Rs 2100");
        System.out.println("5. Checkout");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, quantity;
        int laptop = 0, mouse = 0, keyboard = 0, headphones = 0;
        int total = 0;
        do {
            menu();
            System.out.print("Choose product: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter quantity: ");
                quantity = input.nextInt();
                laptop = laptop + quantity;
                total = total + (89800 * quantity);
                System.out.println(quantity + " Laptop(s) added.");
            }
            else if (choice == 2) {
                System.out.print("Enter quantity: ");
                quantity = input.nextInt();
                mouse = mouse + quantity;
                total = total + (2300 * quantity);
                System.out.println(quantity + " Mouse(s) added.");
            }
            else if (choice == 3) {
                System.out.print("Enter quantity: ");
                quantity = input.nextInt();
                keyboard = keyboard + quantity;
                total = total + (2050 * quantity);
                System.out.println(quantity + " Keyboard(s) added.");
            }
            else if (choice == 4) {
                System.out.print("Enter quantity: ");
                quantity = input.nextInt();
                headphones = headphones + quantity;
                total = total + (2100 * quantity);
                System.out.println(quantity + " Headphone(s) added.");
            }
            else if (choice == 5) {
                System.out.println("\n========== BILL ==========");
                if (laptop > 0)
                    System.out.println("Laptop    x " + laptop + " = Rs " + (laptop * 89800));
                if (mouse > 0)
                    System.out.println("Mouse    x " + mouse + " = Rs " + (mouse * 2300));
                if (keyboard > 0)
                    System.out.println("Keyboard    x " + keyboard + " = Rs " + (keyboard * 2050));
                if (headphones > 0)
                    System.out.println("Headphones    x " + headphones + " = Rs " + (headphones * 2100));
                System.out.println("---------------------------");
                System.out.println("Total Bill = Rs " + total);
                System.out.println("Thank you for shopping!");
            }
            else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        input.close();
    }
}
