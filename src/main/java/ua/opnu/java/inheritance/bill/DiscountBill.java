package ua.opnu.java.inheritance.bill;

public class DiscountBill extends GroceryBill {
    private double discount; // у відсотках, наприклад 10.0 = 10%

    public DiscountBill(double discount) {
        super();
        this.discount = discount;
    }

    public DiscountBill(Employee employee, boolean b) {
        //TODO Auto-generated constructor stub
    }

    public double totalWithDiscount() {
        double total = super.total();
        return total - total * discount / 100.0;
    }

    public Integer getDiscountCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDiscountCount'");
    }

    public Employee getEmployee() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployee'");
    }
}