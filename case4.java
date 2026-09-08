import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    double totalCost() {
        return price * quantity;
    }
}

public class case4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        Product p2 = new Product();

        System.out.print("Enter product 1 ID: ");
        p1.productId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter product 1 name: ");
        p1.productName = sc.nextLine();

        System.out.print("Enter product 1 price: ");
        p1.price = sc.nextDouble();

        System.out.print("Enter product 1 quantity: ");
        p1.quantity = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter product 2 ID: ");
        p2.productId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter product 2 name: ");
        p2.productName = sc.nextLine();

        System.out.print("Enter product 2 price: ");
        p2.price = sc.nextDouble();

        System.out.print("Enter product 2 quantity: ");
        p2.quantity = sc.nextInt();

        double totalBill = p1.totalCost() + p2.totalCost();

        System.out.println("\nProduct 1 Total: ₹" + p1.totalCost());
        System.out.println("Product 2 Total: ₹" + p2.totalCost());
        System.out.println("Total Bill: ₹" + totalBill);

        if (totalBill > 5000) {
            double discount = totalBill * 0.10;
            double finalBill = totalBill - discount;

            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Bill: ₹" + finalBill);
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}