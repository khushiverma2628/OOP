class Practical15 {

    double generateBill(int itemTotal) {
        return itemTotal;
    }

    double generateBill(int itemTotal, int discount) {
        return itemTotal - discount;
    }

    double generateBill(int itemTotal, double discountPercent) {
        double discountAmount = (discountPercent / 100) * itemTotal;
        return itemTotal - discountAmount;
    }
}

public class ShoppingMallBilling {
    public static void main(String[] args) {

        BillGenerator bill = new BillGenerator();

        int itemTotal = 5000;

        String customerType = "festive"; 
        double finalBill = 0;

        if (customerType.equalsIgnoreCase("regular")) {
            finalBill = bill.generateBill(itemTotal);

        } else if (customerType.equalsIgnoreCase("privileged")) {
            finalBill = bill.generateBill(itemTotal, 500);

        } else if (customerType.equalsIgnoreCase("festive")) {
            finalBill = bill.generateBill(itemTotal, 10.0);
        }

        System.out.println("Final Bill Amount: ₹" + finalBill);
    }
}
