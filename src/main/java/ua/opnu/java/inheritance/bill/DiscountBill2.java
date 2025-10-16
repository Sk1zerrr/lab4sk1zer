package ua.opnu.java.inheritance.bill;

import java.util.List;

public class DiscountBill2 {
    private GroceryBill bill;
    private boolean regularCustomer;
    private int discountCount;
    private double discountAmount;

    public DiscountBill2(Employee clerk, boolean regularCustomer) {
        this.bill = new GroceryBill();
        this.regularCustomer = regularCustomer;
    }

    public void add(Item i) {
        bill.add(i);
        if (regularCustomer && i.getDiscount() > 0) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }

    public double getTotal() {
        List<Item> items = bill.getItems();
        double sum = 0.0;
        for (Item i : items) {
            if (regularCustomer) {
                sum += (i.getPrice() - i.getDiscount());
            } else {
                sum += i.getPrice();
            }
        }
        return sum;
    }

    public Class<? extends GroceryBill> getClerk() {
        return bill.getClass();
    }

    public int getDiscountCount() {
        if (!regularCustomer) return 0;
        return discountCount;
    }

    public double getDiscountAmount() {
        if (!regularCustomer) return 0.0;
        return discountAmount;
    }

    public double getDiscountPercent() {
        if (!regularCustomer) return 0.0;
        double full = 0.0;
        for (Item i : bill.getItems()) {
            full += i.getPrice();
        }
        if (full == 0.0) return 0.0;
        double discounted = getTotal();
        return 100.0 - (discounted * 100.0 / full);
    }
}
