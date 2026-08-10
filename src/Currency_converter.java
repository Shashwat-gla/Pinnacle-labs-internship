import java.util.Scanner;
//task 1
class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String from, to;
        double amount;
        double usd = 0;
        double answer = 0;
        System.out.println("Convert currency");
        System.out.println("Currencies: USD, EUR, GBP, INR, JPY");
        System.out.print("Enter your currency: ");
        from = input.next().toUpperCase();
        System.out.print("Enter target currency: ");
        to = input.next().toUpperCase();
        System.out.print("Enter amount: ");
        amount = input.nextDouble();
        // Convert to USD first
        if (from.equals("USD")) {
            usd = amount;
        } else if (from.equals("EUR")) {
            usd = amount / 0.92;
        } else if (from.equals("GBP")) {
            usd = amount / 0.79;
        } else if (from.equals("INR")) {
            usd = amount / 83;
        } else if (from.equals("JPY")) {
            usd = amount / 157;
        } else {
            System.out.println("Invalid currency.");
            return;
        }
        // Convert from USD to target currency
        if (to.equals("USD")) {
            answer = usd;
        } else if (to.equals("EUR")) {
            answer = usd * 0.87;
        } else if (to.equals("GBP")) {
            answer = usd * 0.74;
        } else if (to.equals("INR")) {
            answer = usd * 96;
        } else if (to.equals("JPY")) {
            answer = usd * 162;
        } else {
            System.out.println("Invalid target currency.");
            return;
        }
        System.out.println();
        System.out.println("Converted Amount: " + Math.round(answer * 100.0) / 100.0 + " " + to);
        input.close();
    }
}