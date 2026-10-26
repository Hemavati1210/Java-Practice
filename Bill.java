import java.util.*;

class Bill {

    void bill(int quantity, int price) {
        System.out.println("Total Bill: " + (quantity * price));
    }

    void bill(int quantity, double price) {
        System.out.println("Total Bill: " + (quantity * price));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bill obj = new Bill();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        obj.bill(quantity, price);

    }
}
