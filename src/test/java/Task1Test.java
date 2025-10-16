import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import ua.opnu.java.inheritance.bill.Employee;
import ua.opnu.java.inheritance.bill.Item;
import ua.opnu.java.inheritance.bill.DiscountBill;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Nested
    @DisplayName("Tests for DiscountBill")
    class Test {

        
        @DisplayName("Test clerk for constructor 1")
        void test1() {
            DiscountBill bill = new DiscountBill(new Employee("clerk-1"), true);
            String expected = "clerk-1";
            assertEquals(expected, bill.getEmployee().getName());
        }

        
        @DisplayName("Test clerk for constructor 2")
        void test2() {
            DiscountBill bill = new DiscountBill(new Employee("clerk-2"), false);
            String expected = "clerk-2";
            assertEquals(expected, bill.getEmployee().getName());
        }

        
        @DisplayName("Test getTotal() without discount")
        void test3() {
            DiscountBill bill = new DiscountBill(new Employee("clerk-1"), false);
            bill.add(new Item("candy bar", 1.35));
            assertEquals(1.35, bill.total(), 0.001);
        }

    
        @DisplayName("Test getTotal() with discount")
        void test4() {
            DiscountBill bill = new DiscountBill(new Employee("clerk-1"), true);
            bill.add(new Item("candy bar", 1.35));
            assertEquals(1.10, bill.total(), 0.001);
        }
       @DisplayName("Test multiple items")
        void test5() {
            DiscountBill bill = new DiscountBill(new Employee("clerk-1"), true);
            bill.add(new Item("candy bar", 1.35));
            bill.add(new Item("toy car", 3.25));
            bill.add(new Item("apple", 0.30));
            bill.add(new Item("orange", 0.30));
            bill.add(new Item("newspaper", 0.99));
            assertEquals(5.34, bill.total(), 0.001);
        }

        
        @DisplayName("Test getDiscountCount()")
        void test6() {
            DiscountBill bill = new DiscountBill(new Employee("clerk-1"), true);
            bill.add(new Item("notebook", 3.00));
            bill.add(new Item("lemonade", 1.50));
            bill.add(new Item("bread", 2.25));
            bill.add(new Item("gift card", 75.00));
            bill.add(new Item("bagels", 1.30));
            bill.add(new Item("antique table", 125.00));
            assertEquals(4, bill.getDiscountCount());
        }

        @DisplayName("Test getDiscountAmount()")
        void test7() {
            DiscountBill bill = new DiscountBill(new Employee("clerk-1"), true);
            bill.add(new Item("popcorn", 1.02));
            bill.add(new Item("marmalade", 3.25));
            bill.add(new Item("wristwatch", 67.90));
            bill.add(new Item("juice", 1.50));
            assertEquals(18.47, bill.getDiscountCount(), 0.01);
        }

       
        @DisplayName("Test getDiscountPercent()")
        void test8() {
            DiscountBill bill = new DiscountBill(new Employee("clerk-1"), true);
            bill.add(new Item("vinegar", 4.18));
            bill.add(new Item("soup", 2.50));
            bill.add(new Item("rice", 3.0));
            bill.add(new Item("coffee", 4.25));
            bill.add(new Item("flour", 6.50));
            assertEquals(16.64, bill.getDiscountCount(), 0.01);
        }
    }
}
