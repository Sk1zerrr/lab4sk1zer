package ua.opnu.java.inheritance.bill;

import java.util.ArrayList;
import java.util.List;

public class GroceryBill {
    private List<Item> items;

    public GroceryBill() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public double total() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void add(Item i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}